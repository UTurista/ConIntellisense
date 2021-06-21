using ConIntellisense.Server.Listener;
using ConIntellisense.Server.Service;
using Microsoft.Extensions.Logging;
using OmniSharp.Extensions.LanguageServer.Protocol.Client.Capabilities;
using OmniSharp.Extensions.LanguageServer.Protocol.Document;
using OmniSharp.Extensions.LanguageServer.Protocol.Models;
using OmniSharp.Extensions.LanguageServer.Protocol.Server;
using OmniSharp.Extensions.LanguageServer.Protocol.Server.Capabilities;
using OmniSharp.Extensions.LanguageServer.Protocol.Window;
using System.Threading;
using System.Linq;
using System.Threading.Tasks;

namespace ConIntellisense.Server.Handler
{
    class SemanticTokensHandler : SemanticTokensHandlerBase
    {
        private readonly TextDocumentSyncKind change = TextDocumentSyncKind.Full;

        private readonly DocumentSelector _documentSelector = new(
            new DocumentFilter()
            {
                Pattern = "**/*.con"
            }
        );
        private readonly ILogger<SemanticTokensHandler> logger;
        private readonly ITreeManager treeManager;
        private readonly ILanguageServerFacade router;

        public SemanticTokensHandler(ILogger<SemanticTokensHandler> logger, ILanguageServerFacade router, ITreeManager treeManager)
        {
            this.logger = logger;
            this.treeManager = treeManager;
            this.router = router;
        }

        protected override SemanticTokensRegistrationOptions CreateRegistrationOptions(SemanticTokensCapability capability, ClientCapabilities clientCapabilities)
        {
            router.Window.LogInfo($"capability.TokenModifiers {string.Join(", ", capability.TokenModifiers.Select(x => x.ToString()))}");
            router.Window.LogInfo($"capability.TokenTypes {string.Join(", ", capability.TokenTypes.Select(x => x.ToString()))}");
            return new SemanticTokensRegistrationOptions()
            {
                DocumentSelector = _documentSelector,
                Legend = new SemanticTokensLegend()
                {
                    TokenModifiers = capability.TokenModifiers,
                    TokenTypes = capability.TokenTypes
                },
                Full = new SemanticTokensCapabilityRequestFull
                {
                    Delta = true
                },
                Range = true
            };
        }

        protected override Task<SemanticTokensDocument> GetSemanticTokensDocument(ITextDocumentIdentifierParams request, CancellationToken cancellationToken)
        {
            router.Window.LogInfo($"GetSemanticTokensDocument {request.TextDocument.Uri}");
            return Task.FromResult(new SemanticTokensDocument(RegistrationOptions.Legend));
        }

        protected override Task Tokenize(SemanticTokensBuilder builder, ITextDocumentIdentifierParams request, CancellationToken cancellationToken)
        {
            router.Window.LogInfo($"Tokenizing {request.TextDocument.Uri}...");
            var documentPath = request.TextDocument.Uri.ToString();
            if (!treeManager.GetTree(documentPath, out var root))
            {
                // error
                return Task.CompletedTask;
            }

            SemanticTokensVisitor visitor = new(builder, router);
            visitor.Visit(root);

            router.Window.LogInfo($"Tokenize {request.TextDocument.Uri} complete.");
            return Task.CompletedTask;
        }
    }
}

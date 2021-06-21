using ConIntellisense.Core.Visitor;
using ConIntellisense.Server.Service;
using MediatR;
using Microsoft.Extensions.Logging;
using OmniSharp.Extensions.LanguageServer.Protocol;
using OmniSharp.Extensions.LanguageServer.Protocol.Client.Capabilities;
using OmniSharp.Extensions.LanguageServer.Protocol.Document;
using OmniSharp.Extensions.LanguageServer.Protocol.Models;
using OmniSharp.Extensions.LanguageServer.Protocol.Server;
using OmniSharp.Extensions.LanguageServer.Protocol.Server.Capabilities;
using OmniSharp.Extensions.LanguageServer.Protocol.Window;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;
using Command = ConIntellisense.Core.Context.Command.Command;
namespace ConIntellisense.Server.Handler
{
    public class CompletionHandler : ICompletionHandler
    {
        private readonly ILanguageServerFacade _router;
        private readonly ITreeManager treeManager;
        private readonly ILogger<TextDocumentSyncHandler> logger;
        private readonly TextDocumentSyncKind change  = TextDocumentSyncKind.Full;
        private static readonly IEnumerable<Command> BasicMethodsTable = new List<Command>
        {
            new Command{Name = "ObjectTemplate", SubCommands = new List<Command>{ new Command { Name = "3dMapIcon" }, new Command { Name = "active" } } },
            new Command{Name = "AnimationSystem", SubCommands = new List<Command>{ new Command { Name = "accelaration" }, new Command { Name = "active" } } },
            new Command{Name = "AnimationTemplate", SubCommands = new List<Command>{ new Command { Name = "speedAnimation" }, new Command { Name = "delayAnimation" } } },
            new Command{Name = "WeaponTemplate", SubCommands = new List<Command>{ new Command { Name = "middleCommand", SubCommands = new List<Command> { new Command { Name = "Method" } } }, } },
        };
        private readonly DocumentSelector _documentSelector = new(
            new DocumentFilter()
            {
                Pattern = "**/*.con"
            }
        );

        private SynchronizationCapability _capability;

        public CompletionHandler(ILogger<TextDocumentSyncHandler> logger, ILanguageServerFacade router, ITreeManager treeManager)
        {
            _router = router;
            this.treeManager = treeManager;
            this.logger = logger;
            logger.LogInformation("hello World!!!");
        }

        public CompletionRegistrationOptions GetRegistrationOptions(CompletionCapability capability, ClientCapabilities clientCapabilities)
        {
            return new CompletionRegistrationOptions()
            {
                DocumentSelector = _documentSelector,
            };
        }

        public Task<CompletionList> Handle(CompletionParams request, CancellationToken cancellationToken)
        {
            _router.Window.LogInfo($"AutoCompleting... {request.TextDocument.Uri}...");
            var documentPath = request.TextDocument.Uri.ToString();
            if (!treeManager.GetTree(documentPath, out var root))
            {
                // error
                return Task.FromResult(new CompletionList());
            }

            _router.Window.LogInfo($"Cursor is {request.Position.Line}@{request.Position.Character}.");
            FindSugestionsVisitor visitor = new(BasicMethodsTable, request.Position.Line + 1, request.Position.Character);
            var sugestions = visitor.Visit(root);
            if(sugestions is null)
            {
                _router.Window.LogInfo($"Returned null entries.");
                return Task.FromResult(new CompletionList());
            }

            CompletionList list = new(sugestions.Select(s => new CompletionItem { Label = s, Kind = CompletionItemKind.Reference }), isIncomplete: false);

            _router.Window.LogInfo($"AutoCompleting {request.TextDocument.Uri} complete.");
            return Task.FromResult(list);
        }
    }
}

using MediatR;
using OmniSharp.Extensions.LanguageServer.Protocol;
using OmniSharp.Extensions.LanguageServer.Protocol.Client.Capabilities;
using OmniSharp.Extensions.LanguageServer.Protocol.Document;
using OmniSharp.Extensions.LanguageServer.Protocol.Models;
using OmniSharp.Extensions.LanguageServer.Protocol.Server;
using OmniSharp.Extensions.LanguageServer.Protocol.Server.Capabilities;
using OmniSharp.Extensions.LanguageServer.Protocol.Window;
using System;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;

namespace ConIntellisense.Server.Handler
{
    public class TextDocumentSyncHandler : ITextDocumentSyncHandler
    {
        private readonly ILanguageServerFacade _router;
        private readonly TextDocumentSyncKind change  = TextDocumentSyncKind.Full;

        private readonly DocumentSelector _documentSelector = new(
            new DocumentFilter()
            {
                Pattern = "**/*.con"
            }
        );

        private SynchronizationCapability _capability;

        public TextDocumentSyncHandler(ILanguageServerFacade router)
        {
            _router = router;
        }


        public TextDocumentAttributes GetTextDocumentAttributes(DocumentUri uri)
        {
            return new TextDocumentAttributes(uri, "con");
        }
        public TextDocumentChangeRegistrationOptions GetRegistrationOptions(SynchronizationCapability capability, ClientCapabilities clientCapabilities)
        {
            return new TextDocumentChangeRegistrationOptions()
            {
                DocumentSelector = _documentSelector,
                SyncKind = change
            };
        }

        public Task<Unit> Handle(DidChangeTextDocumentParams request, CancellationToken cancellationToken)
        {
            var documentPath = request.TextDocument.Uri.ToString();
            var text = request.ContentChanges.FirstOrDefault()?.Text;

            // _bufferManager.UpdateBuffer(documentPath, new StringBuffer(text));

            _router.Window.LogInfo($"Updated buffer for document: {documentPath}\n{text}");

            return Unit.Task;
        }

        public Task<Unit> Handle(DidOpenTextDocumentParams request, CancellationToken cancellationToken)
        {
            // _bufferManager.UpdateBuffer(request.TextDocument.Uri.ToString(), new StringBuffer(request.TextDocument.Text));
            return Unit.Task; ;
        }
        public Task<Unit> Handle(DidSaveTextDocumentParams request, CancellationToken cancellationToken)
        {
            throw new NotImplementedException();
        }

        public Task<Unit> Handle(DidCloseTextDocumentParams request, CancellationToken cancellationToken)
        {
            throw new NotImplementedException();
        }
        TextDocumentOpenRegistrationOptions IRegistration<TextDocumentOpenRegistrationOptions, SynchronizationCapability>.GetRegistrationOptions(SynchronizationCapability capability, ClientCapabilities clientCapabilities)
        {
            throw new NotImplementedException();
        }

        TextDocumentCloseRegistrationOptions IRegistration<TextDocumentCloseRegistrationOptions, SynchronizationCapability>.GetRegistrationOptions(SynchronizationCapability capability, ClientCapabilities clientCapabilities)
        {
            throw new NotImplementedException();
        }


        TextDocumentSaveRegistrationOptions IRegistration<TextDocumentSaveRegistrationOptions, SynchronizationCapability>.GetRegistrationOptions(SynchronizationCapability capability, ClientCapabilities clientCapabilities)
        {
            throw new NotImplementedException();
        }
    }
}

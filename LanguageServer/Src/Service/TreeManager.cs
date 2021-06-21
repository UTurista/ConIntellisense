using Antlr4.Runtime;
using ConIntellisense.Core.Parser;
using System.Collections.Concurrent;
using System.Collections.Generic;
using static ConIntellisense.Core.Parser.ConGrammarParser;

namespace ConIntellisense.Server.Service
{
    public interface ITreeManager
    {
        void UpdateTree(string documentPath, string text);
        bool GetTree(string documentPath, out FileContext value);
    }

    public class TreeManager : ITreeManager
    {
        ConcurrentDictionary<string, FileContext> trees = new ConcurrentDictionary<string, FileContext>();

        public void UpdateTree(string documentPath, string text)
        {
            var stream = CharStreams.fromString(text);
            ITokenSource lexer = new ConGrammarLexer(stream);
            ITokenStream tokens = new CommonTokenStream(lexer);
            ConGrammarParser parser = new(tokens);

            var root = parser.file();
            trees.AddOrUpdate(documentPath, root, (key, _) => root);
        }

        public bool GetTree(string documentPath, out FileContext value) 
        {
            return trees.TryGetValue(documentPath, out value);
        }
    }

}

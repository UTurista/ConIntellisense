using Antlr4.Runtime;
using ConIntellisense.Core.Context.Command;
using ConIntellisense.Core.Parser;
using ConIntellisense.Core.Visitor;
using System.Collections.Generic;
using Xunit;
using System.Linq;

namespace Test.Core
{
    public class FindSugestionsTests
    {
        [Theory]
        [InlineData("Obje", new string[] { "ObjectTemplate" })]
        [InlineData("Ani", new string[] { "AnimationSystem", "AnimationTemplate" })]
        [InlineData("AnimationS", new string[] { "AnimationSystem" })]
        public void SimpleMethodAutoComplete(string conContent, string[] expectedSugestions)
        {
            IEnumerable<Command> methodsTable = new List<Command>
            {
                new Command{Name = "ObjectTemplate"},
                new Command{Name = "AnimationSystem"},
                new Command{Name = "AnimationTemplate"},
                new Command{Name = "WeaponTemplate"},
            };

            var stream = CharStreams.fromString(conContent);
            ITokenSource lexer = new ConGrammarLexer(stream);
            ITokenStream tokens = new CommonTokenStream(lexer);
            ConGrammarParser parser = new(tokens);
            var root = parser.file();

            var sugestionFinder = new FindSugestionsVisitor(methodsTable, 1, conContent.Length - 1);
            var sugestions = sugestionFinder.Visit(root);

            Assert.NotNull(sugestions);
            Assert.Single(sugestions);
            Assert.Equal(expectedSugestions, sugestions);
        }

        [Theory]
        [InlineData("ObjectTemplate.activeSafe Obje", new string[] { "ObjectTest" })]
        public void SimpleMethodArgumentAutoComplete(string conContent, string[] expectedSugestions)
        {
            IEnumerable<Command> methodsTable = new List<Command>
            {
                new Command{Name = "ObjectTemplate"},
                new Command{Name = "AnimationSystem"},
                new Command{Name = "AnimationTemplate"},
                new Command{Name = "WeaponTemplate"},
            };

            var stream = CharStreams.fromString(conContent);
            ITokenSource lexer = new ConGrammarLexer(stream);
            ITokenStream tokens = new CommonTokenStream(lexer);
            ConGrammarParser parser = new(tokens);
            var root = parser.file();

            var sugestionFinder = new FindSugestionsVisitor(methodsTable, 1, conContent.Length - 1);
            var sugestions = sugestionFinder.Visit(root);

            Assert.NotNull(sugestions);
            Assert.Single(sugestions);
            Assert.Equal(expectedSugestions, sugestions);
        }
    }
}

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
        private static readonly IEnumerable<Command> BasicMethodsTable = new List<Command>
        {
            new Command{Name = "ObjectTemplate", SubCommands = new List<Command>{ new Command { Name = "3dMapIcon" }, new Command { Name = "active" } } },
            new Command{Name = "AnimationSystem", SubCommands = new List<Command>{ new Command { Name = "accelaration" }, new Command { Name = "active" } } },
            new Command{Name = "AnimationTemplate", SubCommands = new List<Command>{ new Command { Name = "speedAnimation" }, new Command { Name = "delayAnimation" } } },
            new Command{Name = "WeaponTemplate", SubCommands = new List<Command>{ new Command { Name = "middleCommand", SubCommands = new List<Command> { new Command { Name = "Method" } } }, } },
        };

        [Fact]
        public void TestAutoCompleteRoot()
        {
            var stream = CharStreams.fromString("");
            ITokenSource lexer = new ConGrammarLexer(stream);
            ITokenStream tokens = new CommonTokenStream(lexer);
            ConGrammarParser parser = new(tokens);
            var root = parser.file();

            var sugestionFinder = new FindSugestionsVisitor(BasicMethodsTable, 1, 0);
            var sugestions = sugestionFinder.Visit(root);

            var expectedSugestions = new List<string>()
            {
                // All possible keywords
                "if", "endwhile", "elseif", "else", "endif", "while", "run", "include",

                // Comments are keywords (I guess)
                "rem", "beginRem", "endRem",

                // All root Commands
                "ObjectTemplate", "AnimationSystem", "AnimationTemplate", "WeaponTemplate"
            };
            Assert.NotNull(sugestions);
            Assert.Equal(expectedSugestions.Count, sugestions.Count());
            Assert.Equal(expectedSugestions.OrderBy(s => s), sugestions.OrderBy(s => s));
        }

        [Theory]
        [InlineData("Obje", new string[] { "ObjectTemplate" })]
        [InlineData("Ani", new string[] { "AnimationSystem", "AnimationTemplate" })]
        [InlineData("AnimationS", new string[] { "AnimationSystem" })]
        [InlineData("ObjectTemplate.", new string[] { "3dMapIcon", "active" })]
        [InlineData("ObjectTemplate.3d", new string[] { "3dMapIcon" })]
        [InlineData("AnimationSystem.ac", new string[] { "accelaration", "active" })]
        [InlineData("WeaponTemplate.middleCommand.Me", new string[] { "Method" })]
        public void SimpleCommandAutoComplete(string conContent, string[] expectedSugestions)
        {
            var stream = CharStreams.fromString(conContent);
            ITokenSource lexer = new ConGrammarLexer(stream);
            ITokenStream tokens = new CommonTokenStream(lexer);
            ConGrammarParser parser = new(tokens);
            var root = parser.file();

            var sugestionFinder = new FindSugestionsVisitor(BasicMethodsTable, 1, conContent.Length - 1);
            var sugestions = sugestionFinder.Visit(root);

            Assert.NotNull(sugestions);
            Assert.Equal(expectedSugestions.Length, sugestions.Count());
            Assert.Equal(expectedSugestions, sugestions);
        }

        [Theory]
        [InlineData("ObjectTemplate.activeSafe Obje", new string[] { "ObjectTest" })]
        public void SimpleMethodArgumentAutoComplete(string conContent, string[] expectedSugestions)
        {
            var stream = CharStreams.fromString(conContent);
            ITokenSource lexer = new ConGrammarLexer(stream);
            ITokenStream tokens = new CommonTokenStream(lexer);
            ConGrammarParser parser = new(tokens);
            var root = parser.file();

            var sugestionFinder = new FindSugestionsVisitor(BasicMethodsTable, 1, conContent.Length - 1);
            var sugestions = sugestionFinder.Visit(root);

            Assert.NotNull(sugestions);
            Assert.Single(sugestions);
            Assert.Equal(expectedSugestions, sugestions);
        }
    }
}

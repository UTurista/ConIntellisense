using ConIntellisense.Core.Context.Command;
using System.Collections.Generic;
using System.Linq;

namespace ConIntellisense.Core.Helper
{
    public class FindSugestionsHelper
    {
        internal static IEnumerable<string> AutoCompleteCommand(IEnumerable<Command> methodTable, string commandText)
        {
            // If we haven't write any command then all commands are possible
            if (string.IsNullOrEmpty(commandText))
            {
                return methodTable.Select(s => s.Name);
            }

            // The command path is splited by a dot
            // the auto complete serves only for the text
            // past the last dot
            var possibleCommands = methodTable;
            var commands = commandText.Split(".");
            for (var i = 0; i < commands.Length - 1; i++)
            {
                possibleCommands = possibleCommands?.FirstOrDefault(s => s.Name == commands[i]).SubCommands;
            }

            if (possibleCommands is null || !possibleCommands.Any())
            {
                return Enumerable.Empty<string>();
            }

            return possibleCommands.Where(p => p.Name.StartsWith(commands.Last())).Select(p => p.Name);
        }

        internal static IEnumerable<string> AutoCompleteArgument(string methodFullName, string argumentText)
        {
            return new List<string>(){
                        "ObjectTest"
                    };
        }
    }
}

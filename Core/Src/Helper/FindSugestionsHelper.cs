using ConIntellisense.Core.Context.Command;
using System.Collections.Generic;
using System.IO;
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

            // given the text 'Xxxx.Xxxx.Yyyy' we assume the 'Xxxx' is a proper command
            // and we simply want to figure out the 'Yyyy' thus we discard it for now
            var lastDot = commandText.LastIndexOf('.');
            var parentCommandText = commandText.Substring(0, lastDot);
            var parentCommand = GetCommand(methodTable, parentCommandText);
            var methodText = commandText.Substring(lastDot + 1); // Skip the parentText including the dot

            return parentCommand?.SubCommands.Where(p => p.Name.StartsWith(methodText)).Select(p => p.Name) ?? Enumerable.Empty<string>();
        }

        internal static IEnumerable<string> AutoCompleteArgument(IEnumerable<Command> methodTable, string methodFullName, int argumentIdx, string argumentText)
        {
            var command = GetCommand(methodTable, methodFullName);
            if(command is null)
            {
                return Enumerable.Empty<string>();
            }

            if(command.Parameters is null || !command.Parameters.Any() || command.Parameters.Count <= argumentIdx)
            {
                return Enumerable.Empty<string>();
            }

            return new List<string>() { "ObjectTest" };
        }

        internal static IEnumerable<string> AutoCompleteRoot(IEnumerable<Command> methodsTable)
        {
            var results = new List<string>
            {
                // Keywords
                "if",
                "else",     // I've checked and even outside a valid if block, C# IDEs offer the else statment
                "elseif",   // I've checked and even outside a valid if block, C# IDEs offer the elseif statment
                "while",
                "run",
                "include",
                
                // Coments
                "rem",
                "beginRem",
                "endRem",
            };

            // Available root classes
            results.AddRange(methodsTable.Select(x => x.Name));

            return results;
        }

        internal static Command GetCommand(IEnumerable<Command> methodTable, string commandText)
        {
            var possibleCommands = methodTable;
            var commands = commandText.Split(".");
            Command command = null;
            for (var i = 0; i < commands.Length; i++)
            {
                command = possibleCommands?.FirstOrDefault(s => s.Name == commands[i]);
                if(command is null)
                {
                    return null;
                }

                possibleCommands = command.SubCommands;
            }

            return command;
        }

        internal static IEnumerable<string> AutoCompletePath(string path)
        {
            var full = Path.GetFullPath(path);
            var directort = Path.GetDirectoryName(full);
            var name = Path.GetFileName(full);
            if (!Directory.Exists(directort))
            {
                return Enumerable.Empty<string>();
            }

            var info = new DirectoryInfo(directort);
            var sugestions = new List<string>();
            foreach(var fsi in info.GetFileSystemInfos())
            {
                
                if ((fsi.Attributes & FileAttributes.Directory) == FileAttributes.Directory)
                {
                    sugestions.Add($"{fsi.Name}/");
                }
                else
                {
                    sugestions.Add(fsi.Name);
                }
            }

            return sugestions;
        }
    }
}

using System;
using System.Linq;
using System.IO;
using System.Text;
using ConIntellisense.Core.Context.Command;
using System.Collections.Generic;
using System.Text.Json;
using System.Globalization;

namespace CLI
{
    class refere{
        public Dictionary<string, refere> referec = new();
        public Command command = new();
    }

    class Program
    {
        static refere commandsToAdd = new();


        static void Main(string[] args)
        {
           
            var lines = File.ReadAllLines("TextFile1.txt");
            Command newCommand = null ;
            var lastDescription = new StringBuilder();
            foreach (var line in lines)
            {
                if(line.StartsWith(";") && line.IndexOf("->") > -1)
                {
                    if(newCommand is not null)
                    {
                        newCommand.Descrition = lastDescription.ToString().Trim();
                        AddNewCommand(newCommand);
                    }
                    newCommand = new();
                    var data = line.Substring(1); // Strip the ';'
                    var command = data.Substring(0, data.IndexOf(" ")); //Get everything till the first space
                    newCommand.Name = command;

                    var rawParameters = data.Substring(command.Length, data.IndexOf("->") - command.Length);
                    var rawReturn = data.Substring(command.Length + rawParameters.Length + 2).Trim();
                    rawParameters = rawParameters.Replace("<nowiki>", "");
                    rawParameters = rawParameters.Replace("</nowiki>", "");
                    rawParameters = rawParameters.Replace("std::", "");
                    var parameters = rawParameters.Trim().Split(" ");
                    if(parameters.Any())
                    {
                        newCommand.Parameters = parameters.Select(p => new ComandType
                        {
                            Name = string.Empty,
                            Descrition = string.Empty,
                            Type = p,
                        }).ToList();
                    }

                    rawReturn = rawReturn.Replace("<nowiki>", "");
                    rawReturn = rawReturn.Replace("</nowiki>", "");
                    rawReturn = rawReturn.Replace("std::", "");
                    newCommand.Return = new ComandType
                    {
                        Name = string.Empty,
                        Descrition = string.Empty,
                        Type = rawReturn,
                    };
                     lastDescription = new StringBuilder();
                }else if (line.StartsWith(";"))
                {
                    newCommand = null;
                    lastDescription = new StringBuilder();
                }
                else if(line.StartsWith(":"))
                {
                    lastDescription.AppendLine(line.Substring(1));
                }
            }
            OnEnd();
        }

        private static void OnEnd()
        {
            var rootCommands = commandsToAdd.referec.Values.Select(c => c.command);
            string json = JsonSerializer.Serialize(rootCommands);
            File.WriteAllText("rot.json", json);
        }

        private static void AddNewCommand(Command newCommand)
        {
            TextInfo textInfo = new CultureInfo("en-US", false).TextInfo;
           var parentPath = newCommand.Name.Split(".");
            newCommand.Name = parentPath[parentPath.Length - 1];

            var refe = commandsToAdd;
            for (var i = 0; i< parentPath.Length - 1;i++)
            {
                if(!refe.referec.TryGetValue(parentPath[i], out var subref))
                {
                    subref = new refere();
                    subref.command.Name = parentPath[i];
                    refe.referec.Add(parentPath[i], subref);
                }
                refe = subref;
            }
            refe.command.SubCommands.Add(newCommand);


        }
    }
}

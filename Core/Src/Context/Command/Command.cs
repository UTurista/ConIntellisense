using System.Collections.Generic;

namespace ConIntellisense.Core.Context.Command
{
    public class Command
    {
        public string Name { get; set; }

        public string Descrition { get; set; }

        public List<Command> SubCommands { get; set; } = new();

        public List<ComandType> Parameters { get; set; }

        public ComandType Return { get; set; }
    }
}

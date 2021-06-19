using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConIntellisense.Core.Helper
{
    public class FindSugestionsHelper
    {
        internal static IEnumerable<string> AutoCompleteMethod(string a, string v)
        {
            return new List<string>(){
                    "ObjectTemplate"
                };
        }

        internal static IEnumerable<string> AutoCompleteArgument(string v1, string v2)
        {
            return new List<string>(){
                        "ObjectTest"
                    };
        }
    }
}

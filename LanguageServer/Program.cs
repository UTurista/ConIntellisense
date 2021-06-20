using ConIntellisense.Server.Handler;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Logging;
using OmniSharp.Extensions.LanguageServer.Protocol.Window;
using OmniSharp.Extensions.LanguageServer.Server;
using System;
using System.Threading.Tasks;

namespace ConIntellisense.Server
{
    class Program
    {
        static async Task Main(string[] args)
        {
            var server = await LanguageServer.From(options =>
            options
                .WithInput(Console.OpenStandardInput())
                .WithOutput(Console.OpenStandardOutput())
                .WithLoggerFactory(new LoggerFactory())
                .AddDefaultLoggingProvider()
                //.WithMinimumLogLevel(LogLevel.Trace)
                .WithServices(ConfigureServices)
                .WithHandler<TextDocumentSyncHandler>()
             );

            server.LogInfo("asdasdasdasdasdasd");
            server.Window.LogInfo($"Starting server with PID: { Environment.ProcessId}...");
            await server.WaitForExit;
        }

        static void ConfigureServices(IServiceCollection services)
        {
            // services.AddSingleton<BufferManager>();
        }
    }
}

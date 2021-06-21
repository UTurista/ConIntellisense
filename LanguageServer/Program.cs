using ConIntellisense.Server.Handler;
using ConIntellisense.Server.Service;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Logging;
using OmniSharp.Extensions.LanguageServer.Protocol.Models;
using OmniSharp.Extensions.LanguageServer.Protocol.Window;
using OmniSharp.Extensions.LanguageServer.Server;
using Serilog;
using System;
using System.Threading.Tasks;

namespace ConIntellisense.Server
{
    class Program
    {
        static async Task Main(string[] args)
        {
            Log.Logger = new LoggerConfiguration()
            .Enrich.FromLogContext()
            .WriteTo.File("log.txt", rollingInterval: RollingInterval.Day)
            .MinimumLevel.Verbose()
            .CreateLogger();

            Log.Logger.Information("This only goes file...");

            IObserver<WorkDoneProgressReport> workDone = null!;
            var server = await LanguageServer.From(options =>
            options
                .WithInput(Console.OpenStandardInput())
                .WithOutput(Console.OpenStandardOutput())
                .ConfigureLogging(x => x
                                .AddSerilog(Log.Logger)
                                .AddLanguageProtocolLogging()
                                .SetMinimumLevel(LogLevel.Trace))
                .AddDefaultLoggingProvider()
                //.WithMinimumLogLevel(LogLevel.Trace)
                .WithServices(ConfigureServices)
                .WithHandler<TextDocumentSyncHandler>()
             ).ConfigureAwait(true);

            server.LogInfo("asdasdasdasdasdasd");
            server.Window.LogInfo($"POTATO server with PID: { Environment.ProcessId}...");
            Log.Logger.Information($"HELLO server with PID: { Environment.ProcessId}...");
            await server.WaitForExit;
        }

        static void ConfigureServices(IServiceCollection services)
        {
            services
                .AddSingleton<ITreeManager, TreeManager>()
                .AddSingleton(new ConfigurationItem { Section = "typescript", })
                .AddSingleton(new ConfigurationItem { Section = "terminal", });
        }
    }
}

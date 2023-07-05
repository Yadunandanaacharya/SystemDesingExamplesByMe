package Main.Java.SystemDesignExamples.LoggingFrameWork;

public class LogManager {
    protected static AbstractLogger BuildChainOfLogger() {
        AbstractLogger infoLogger = new InfoLogger(1);
        AbstractLogger errorLogger = new ErrorLogger(2);
        AbstractLogger debugLogger = new DebugLogger(3);

        infoLogger.setNextLoggingLevel(errorLogger);
        errorLogger.setNextLoggingLevel(debugLogger);
        return  infoLogger;
    }

    protected static LogSubject BuildSubject() {
        LogSubject logSubject = new LogSubject();
        ConsoleLogger consoleLogger = new ConsoleLogger();
        FileLogger fileLogger = new FileLogger();

        logSubject.AddObserver(1, consoleLogger);
        logSubject.AddObserver(2, consoleLogger);
        logSubject.AddObserver(3, consoleLogger);

        logSubject.AddObserver(1, fileLogger);
        logSubject.AddObserver(3, fileLogger);

        return logSubject;
    }
}

package Main.Java.SystemDesignExamples.LoggingFrameWork;

public abstract class AbstractLogger {
    int level;
    AbstractLogger nextLoggingLevel;

    public void setNextLoggingLevel(AbstractLogger nextLoggingLevel) {
        this.nextLoggingLevel = nextLoggingLevel;
    }

    void LogMessage(int level, String msg, LogSubject logSubject) {
        if (this.level == level) {
            Display(msg, logSubject);
        }
        if (nextLoggingLevel != null) {
            nextLoggingLevel.LogMessage(level, msg, logSubject);
        }
    }

    protected abstract void Display(String msg, LogSubject logSubject);
}

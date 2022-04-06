package Main.Java.SystemDesignExamples.LoggingFrameWork;

public abstract class AbstractLogger {
    int level;
    AbstractLogger nextLoggingLevel;

    public void setNextLoggingLevel(AbstractLogger nextLoggingLevel) {
        this.nextLoggingLevel = nextLoggingLevel;
    }

    void LogMessage(int level, String msg) {
        if (this.level <= level) {
            Display(msg);
        }
        if (nextLoggingLevel != null) {
            nextLoggingLevel.LogMessage(level, msg);
        }
    }

    protected abstract void Display(String msg);
}

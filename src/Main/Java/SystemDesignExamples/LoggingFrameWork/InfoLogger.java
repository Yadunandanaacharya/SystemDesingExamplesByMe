package Main.Java.SystemDesignExamples.LoggingFrameWork;

public class InfoLogger extends AbstractLogger{
    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void Display(String msg, LogSubject logSubject) {
        String message = "Info " + msg;
        logSubject.NotifyAllObserver(1, message);
    }
}

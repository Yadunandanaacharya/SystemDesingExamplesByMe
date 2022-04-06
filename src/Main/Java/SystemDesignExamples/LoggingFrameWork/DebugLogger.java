package Main.Java.SystemDesignExamples.LoggingFrameWork;

public class DebugLogger extends AbstractLogger{
    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void Display(String msg) {
        System.out.println("Debug " + msg);
    }
}
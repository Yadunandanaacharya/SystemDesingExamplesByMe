package Main.Java.SystemDesignExamples.LoggingFrameWork;

public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void Display(String msg) {
        System.out.println("Error " + msg);
    }
}
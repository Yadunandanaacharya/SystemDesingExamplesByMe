package Main.Java.SystemDesignExamples.LoggingFrameWork;

public class ConsoleLogger implements LogObserver{
    @Override
    public void log(String msg) {
        System.out.println("Console: " + msg);
    }
}

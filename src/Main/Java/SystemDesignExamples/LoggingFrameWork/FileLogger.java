package Main.Java.SystemDesignExamples.LoggingFrameWork;

public class FileLogger implements LogObserver{

    public void log(String msg) {
        System.out.println("Write to file: " + msg);
    }
}

package Main.Java.SystemDesignExamples.LoggingFrameWork;

public class ApplicationMain {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
//        logger.Info("This is info");
//        logger.Error("This is error");
        logger.Debug("This is debug");
    }
}

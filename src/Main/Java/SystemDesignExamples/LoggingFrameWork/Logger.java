package Main.Java.SystemDesignExamples.LoggingFrameWork;

import java.io.Serializable;

import static Main.Java.SystemDesignExamples.LoggingFrameWork.LogManager.BuildChainOfLogger;

public class Logger implements Cloneable, Serializable {
    private volatile static Logger loggerObject;
    private volatile static AbstractLogger chainOfLogger;
    private Logger() {
        if(loggerObject!= null)
            throw new IllegalStateException("Object already created");
    }
    public static Logger getInstance() {
        if(loggerObject == null) {
            synchronized(Logger.class){
                if(loggerObject == null) {
                    loggerObject = new Logger();
                    chainOfLogger = BuildChainOfLogger();
                }
            }
        }
        return loggerObject;
    }
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
    protected Object readResolve(){
        return loggerObject;
    }
    private void CreateLog(int level, String msg) {
        chainOfLogger.LogMessage(level, msg);
    }
    public void Info(String msg) {
        CreateLog(1, msg);
    }
    public void Error(String msg) {
        CreateLog(2, msg);
    }
    public void Debug(String msg) {
        CreateLog(3, msg);
    }

}

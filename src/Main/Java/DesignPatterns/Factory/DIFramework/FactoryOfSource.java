package Main.Java.DesignPatterns.Factory.DIFramework;

public class FactoryOfSource {
    IngestToDatabase sourceSystemObject = null;

    public  IngestToDatabase getInstanceOfSource(String source){

        return sourceSystemObject;
    }
}

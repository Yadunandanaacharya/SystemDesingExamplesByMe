package Main.Java.DesignPatterns.Factory.DIFramework;

public interface IngestionService {
    default void ingestDataToMyDataBase(String source) {
//        SourceDataFromFile sourceDataFromFile = new SourceDataFromFile();
        IngestToDatabase sourceSystemObject = getInstanceOfSource(source);
        sourceSystemObject.ingestData();
    }
    IngestToDatabase getInstanceOfSource(String source);
} 

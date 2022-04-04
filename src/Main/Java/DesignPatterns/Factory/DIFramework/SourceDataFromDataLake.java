package Main.Java.DesignPatterns.Factory.DIFramework;

public class SourceDataFromDataLake implements IngestToDatabase {
    @Override
    public  void ingestData() {
        System.out.println("reads from DataLake and ingest");
    }
}

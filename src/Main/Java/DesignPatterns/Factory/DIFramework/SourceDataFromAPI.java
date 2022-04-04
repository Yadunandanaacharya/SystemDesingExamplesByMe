package Main.Java.DesignPatterns.Factory.DIFramework;

public class SourceDataFromAPI implements IngestToDatabase {
    @Override
    public  void ingestData() {
        System.out.println("reads from API and ingest");
    }
}

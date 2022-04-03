package Main.Java.DesignPatterns.Factory.SimpleFactoryPattern;

public class SourceFromDataBase  implements IngestToDatabase {
    @Override
    public  void ingestData() {
        System.out.println("reads from DATABASE and ingest with new class FactorySource ");
    }
}

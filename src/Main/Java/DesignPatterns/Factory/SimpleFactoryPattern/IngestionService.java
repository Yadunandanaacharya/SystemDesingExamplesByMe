package Main.Java.DesignPatterns.Factory.SimpleFactoryPattern;

public class IngestionService {
    private FactoryOfSource factoryOfSource;

    public IngestionService(FactoryOfSource factoryOfSource) {
        this.factoryOfSource = factoryOfSource;
    }

    public  void ingestDataToMyDataBase(String source) {
//        SourceDataFromFile sourceDataFromFile = new SourceDataFromFile();

        IngestToDatabase sourceSystemObject = factoryOfSource.getInstanceOfSource(source);
        sourceSystemObject.ingestData();
    }
}

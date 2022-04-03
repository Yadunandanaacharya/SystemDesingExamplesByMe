package Main.Java.DesignPatterns.Factory.SimpleFactoryPattern;

public class FactoryMain {
    public static  void  main(String[] args) {
        FactoryOfSource factoryOfSource = new FactoryOfSource();

        IngestionService ingestionService = new IngestionService(factoryOfSource    );
//        ingestionService.ingestDataToMyDataBase("API");
//        ingestionService.ingestDataToMyDataBase("DATALAE");
        ingestionService.ingestDataToMyDataBase("DATABASE");
    }
}

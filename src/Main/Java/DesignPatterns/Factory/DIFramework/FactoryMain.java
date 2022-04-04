package Main.Java.DesignPatterns.Factory.DIFramework;

public class FactoryMain {
    public static  void  main(String[] args) {
        IngestionService onPremiseStorage = new OnPremiseStorage();
        onPremiseStorage.ingestDataToMyDataBase("API");
        IngestionService cloudStorage = new CloudStorage();
        cloudStorage.ingestDataToMyDataBase("API");


    }
}

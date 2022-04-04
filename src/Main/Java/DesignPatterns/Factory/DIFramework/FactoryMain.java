package Main.Java.DesignPatterns.Factory.DIFramework;

public class FactoryMain {
    public static  void  main(String[] args) {
//        IngestionService onPremiseStorage = new OnPremiseStorage();
//        onPremiseStorage.ingestDataToMyDataBase("API");

        StorageFactory storageFactory = new StorageFactory();
        IngestionService cloudStorage = storageFactory.getStorageService("CLOUD");
        cloudStorage.ingestDataToMyDataBase("API");


    }
}

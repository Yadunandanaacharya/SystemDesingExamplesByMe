package Main.Java.DesignPatterns.Factory.DIFramework;

public class CloudStorage implements IngestionService {
    @Override
    public  IngestToDatabase getInstanceOfSource(String source) {
        if (source.equals("API"))  return new CloudSourceDataFromAPI();
        else if (source.equals("FILE"))  return new CloudSourceFromFile();

        return  null;
    }
}

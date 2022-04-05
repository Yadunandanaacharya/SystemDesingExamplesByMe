package Main.Java.DesignPatterns.ChainOfResponsibility;

public class ChainCreator {
    public Managers CreateChain() {
        HiringManager hiringManager = new HiringManager(10000, "Ram");
        SeniorManager seniorManager = new SeniorManager(30000, "Sham");
        Director director = new Director(35000, "Ayush");

        hiringManager.SetManager(seniorManager);
        seniorManager.SetManager(director);
        return hiringManager;
    }
}

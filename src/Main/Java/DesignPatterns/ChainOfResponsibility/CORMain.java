package Main.Java.DesignPatterns.ChainOfResponsibility;

//cormain means chain of responsibility for cor
public class CORMain {
    public static void main(String[] args) {
        ChainCreator chainCreator = new ChainCreator();
        Managers managers =  chainCreator.CreateChain();
        managers.ApproveSalary(9000);
        managers.ApproveSalary(30000);
        managers.ApproveSalary(34000);
        managers.ApproveSalary(500000);
    }
}

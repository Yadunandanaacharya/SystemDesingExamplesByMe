package Main.Java.DesignPatterns.ChainOfResponsibility;

public class Director extends Managers {
    public Director(int approvalLimit, String hiringManagerName) {
        this.approvalLimit = approvalLimit;
        this.managerName = hiringManagerName;
    }

    @Override
    protected void ProcessSalary(int employeeSalary) {
        System.out.println(this.managerName + " has approved the salary at level 3, for " +
                " salary amount " + employeeSalary);
    }
}
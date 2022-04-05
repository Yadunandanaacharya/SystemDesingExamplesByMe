package Main.Java.DesignPatterns.ChainOfResponsibility;

public class SeniorManager extends Managers {
    public SeniorManager(int approvalLimit, String hiringManagerName) {
        this.approvalLimit = approvalLimit;
        this.managerName = hiringManagerName;
    }

    @Override
    protected void ProcessSalary(int employeeSalary) {
        System.out.println(this.managerName + " has approved the salary at level 2, for " +
                " salary amount " + employeeSalary);
    }
}

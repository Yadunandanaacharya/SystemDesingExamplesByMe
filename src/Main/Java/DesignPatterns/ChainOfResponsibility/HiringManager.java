package Main.Java.DesignPatterns.ChainOfResponsibility;

public class HiringManager extends Managers{
    public HiringManager(int approvalLimit, String hiringManagerName) {
        this.approvalLimit = approvalLimit;
        this.managerName = hiringManagerName;
    }

    @Override
    protected void ProcessSalary(int employeeSalary) {
        System.out.println(this.managerName + " has approved the salary at level 1, for " +
                " salary amount " + employeeSalary);
    }
}

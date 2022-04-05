package Main.Java.DesignPatterns.ChainOfResponsibility;

public abstract class Managers {
    protected Managers managers;
    int approvalLimit;
    String managerName;

    public void SetManager(Managers managers) {
        this.managers = managers;
    }

    public void ApproveSalary(int employeeSalary) {
        if (this.approvalLimit > employeeSalary) {
            ProcessSalary(employeeSalary);
        } else if (managers != null) {
            managers.ApproveSalary(employeeSalary);
            //delegate this to the next manager
        } else {
            System.out.println("Cannot make the offer to candidate");
        }
    }

    protected abstract void ProcessSalary(int employeeSalary);
}

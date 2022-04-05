package Main.Java.DesignPatterns.Facade;

public class SoftWareChceck {
    OSCheckOnBoot osCheckOnBoot;
    DriverCheck driverCheck;

    public  SoftWareChceck() {
        this.osCheckOnBoot = new OSCheckOnBoot();
        this.driverCheck = new DriverCheck();
    }

    boolean CheckSoftwareOnBoot() {
        return osCheckOnBoot.checkOSOnBoot() && driverCheck.checkDriverOnBoot();
    }
}

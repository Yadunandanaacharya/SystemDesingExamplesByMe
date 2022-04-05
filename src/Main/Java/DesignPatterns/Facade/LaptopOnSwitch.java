package Main.Java.DesignPatterns.Facade;

public class LaptopOnSwitch {
    SoftWareChceck softWareChceck;
    HardWareChecks hardWareChecks;

    public LaptopOnSwitch() {
        this.softWareChceck = new SoftWareChceck();
        this.hardWareChecks = new HardWareChecks();
    }

    void SwitchOnLaptop() {
        if (hardWareChecks.checkAllHardWares() && softWareChceck.CheckSoftwareOnBoot()) {
            System.out.println("Switching on Laptop");
        }
    }
}

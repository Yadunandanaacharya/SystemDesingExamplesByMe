package Main.Java.DesignPatterns.Facade;

public class HardWareChecks {
    MotherBoard motherBoard;
    RAM ram;

    public HardWareChecks() {
        this.motherBoard = new MotherBoard();
        this.ram = new RAM();
    }

    boolean checkAllHardWares() {
        return  motherBoard.checkMotherBoardOnBoot() && ram.checkRAMOnBoot();
    }
}

package Main.Java.DesignPatterns.Decorator;

public abstract class Beverage {
    String beverageName = "";
    String getBeverageName() {
        return  beverageName;
    }

    abstract int getBeveragePrice();
}

package Main.Java.DesignPatterns.Factory.Decorator;

public abstract class Beverage {
    String beverageName = "";
    String getBeverageName() {
        return  beverageName;
    }

    abstract int getBeveragePrice();
}

package Main.Java.DesignPatterns.Decorator;

public class CoffeeHouse {
    public  static  void  main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getBeverageName());
        System.out.println(beverage.getBeveragePrice());

        //when i want espresso with milk, we add milk to the existing object that is beverage.
        beverage = new Milk(beverage);
        System.out.println("After decorating with milk");
        System.out.println(beverage.getBeverageName());
        System.out.println(beverage.getBeveragePrice());

        //now i have to add double of caramel so for same object pass caremel(beverage) twice and then print it.
        beverage = new Caramel(beverage);
        beverage = new Caramel(beverage);
        System.out.println("After decorating with double Caramel");
        System.out.println(beverage.getBeverageName());
        System.out.println(beverage.getBeveragePrice());
    }
}

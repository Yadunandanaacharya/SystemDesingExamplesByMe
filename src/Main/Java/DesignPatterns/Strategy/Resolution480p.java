package Main.Java.DesignPatterns.Strategy;

public class Resolution480p implements Resolution{
    @Override
    public void resolution() {
        System.out.println("Playing video at resolution 480p");
    }
}
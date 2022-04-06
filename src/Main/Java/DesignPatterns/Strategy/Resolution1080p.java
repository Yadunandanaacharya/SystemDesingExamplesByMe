package Main.Java.DesignPatterns.Strategy;

public class Resolution1080p implements Resolution{
    @Override
    public void resolution() {
        System.out.println("Playing video at resolution 1080p");
    }
}

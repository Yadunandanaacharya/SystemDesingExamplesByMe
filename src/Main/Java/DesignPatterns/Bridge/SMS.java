package Main.Java.DesignPatterns.Bridge;

public class SMS implements NotificationSender{

    @Override
    public void SendNotification() {
        System.out.println("We are going to send SMS");
    }
}

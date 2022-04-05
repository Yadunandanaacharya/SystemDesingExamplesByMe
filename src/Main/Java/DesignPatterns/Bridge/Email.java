package Main.Java.DesignPatterns.Bridge;

public class Email implements NotificationSender{
    @Override
    public void SendNotification() {
        System.out.println("We are going to send Email");
    }
}

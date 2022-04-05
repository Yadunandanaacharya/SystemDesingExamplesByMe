package Main.Java.DesignPatterns.Bridge;

public class QRMessage extends Notification{
    public QRMessage(NotificationSender notificationSender) {
        super(notificationSender);
        System.out.println("This is a QR message");
    }

    @Override
    void SendMessage() {
        //call some method to build qr code
        notificationSender.SendNotification();
    }
}

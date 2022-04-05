package Main.Java.DesignPatterns.Bridge;

public class BridgeMain {
    public static void main(String[] args) {
//        TextMessage textMessage = new TextMessage(new Email());
//        textMessage.SendMessage();
        QRMessage qrMessage = new QRMessage(new Email());
        qrMessage.SendMessage();
        

    }
}

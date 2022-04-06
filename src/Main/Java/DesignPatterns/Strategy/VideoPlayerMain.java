package Main.Java.DesignPatterns.Strategy;

public class VideoPlayerMain {
    public static void main(String[] args) {
        Resolution resolution = new Resolution1080p();
        Device device = new Mobile();
        VideoPlayer videoPlayer = new PhonePlayer(device, resolution);
        videoPlayer.display();
    }
}

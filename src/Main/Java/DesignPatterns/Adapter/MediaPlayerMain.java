package Main.Java.DesignPatterns.Adapter;

public class MediaPlayerMain {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayerImplementation();
        mediaPlayer.play("mySong","mp3");
        mediaPlayer.play("mySong","mp4");
    }
}

package Main.Java.DesignPatterns.Adapter;

public class MediaPlayerImplementation implements MediaPlayer{
    MediaPlayerAdapter mediaPlayerAdapter;
    MediaPlayer mediaPlayer;

    @Override
    public void play(String fileToPlay, String formatToPlay) {
        if (formatToPlay.equals("mp3")) {
            mediaPlayer = new DefaultMediaPlayer();
            mediaPlayer.play(fileToPlay, formatToPlay);
        } else {
            AdvancedFormat advancedFormat = new AdvancedFormat();
            advancedFormat.setResolution("720p");
            mediaPlayerAdapter = new MediaPlayerAdapter(advancedFormat);
            mediaPlayerAdapter.play(fileToPlay, formatToPlay);
        }
    }

}

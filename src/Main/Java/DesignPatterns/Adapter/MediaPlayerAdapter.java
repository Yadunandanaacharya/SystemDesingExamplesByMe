package Main.Java.DesignPatterns.Adapter;

public class MediaPlayerAdapter implements MediaPlayer{
    AdvanceMediaPlayer advanceMediaPlayer;
    AdvancedFormat advancedFormat;

    public  MediaPlayerAdapter(AdvancedFormat advancedFormat) {
        advanceMediaPlayer = new AVIPlayer();
        this.advancedFormat = advancedFormat;
    }

    @Override
    public void play(String fileToPlay, String formatToPlay) {
        advancedFormat.setFileToPlay(fileToPlay);
        advancedFormat.setFormatToPlay(formatToPlay);
        advanceMediaPlayer.playAdvanceFormat(advancedFormat);
    }
}

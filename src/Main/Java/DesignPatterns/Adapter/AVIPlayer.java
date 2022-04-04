package Main.Java.DesignPatterns.Adapter;

public class AVIPlayer implements AdvanceMediaPlayer{
    @Override
    public  void playAdvanceFormat(AdvancedFormat advancedFormat) {
        System.out.println("playing using advanced media player " + advancedFormat.getFileToPlay() +
                "." + advancedFormat.getFormatToPlay() + " in resolution " + advancedFormat.getResolution());
    }
}

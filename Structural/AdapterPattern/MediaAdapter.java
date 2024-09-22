package Structural.AdapterPattern;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("MP4")) {
            advancedMediaPlayer = new AdvancedMediaPlayer();
        } else if (audioType.equalsIgnoreCase("VLC")) {
            advancedMediaPlayer = new AdvancedMediaPlayer();
        } else {
            throw new IllegalArgumentException("Invalid media type: " + audioType);
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("MP4")) {
            advancedMediaPlayer.playMP4(filename);
        } else if (audioType.equalsIgnoreCase("VLC")) {
            advancedMediaPlayer.playVLC(filename);
        } else {
            throw new IllegalArgumentException("Invalid media type: " + audioType);
        }
    }
}

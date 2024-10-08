package Structural.AdapterPattern;

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("MP3")) {
            System.out.println("Playing MP3 file: " + filename);
        } else if (audioType.equalsIgnoreCase("MP4") || audioType.equalsIgnoreCase("VLC")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        } else {
            System.out.println("Invalid media type: " + audioType);
        }
    }
}

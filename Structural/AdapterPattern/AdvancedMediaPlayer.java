package Structural.AdapterPattern;

// Adaptee class
public class AdvancedMediaPlayer {
    public void playMP4(String filename) {
        System.out.println("Playing MP4 file: " + filename);
    }

    public void playVLC(String filename) {
        System.out.println("Playing VLC file: " + filename);
    }
}

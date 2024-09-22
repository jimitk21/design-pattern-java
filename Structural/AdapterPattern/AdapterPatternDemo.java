package Structural.AdapterPattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("MP3", "song.mp3");
        audioPlayer.play("MP4", "movie.mp4");
        audioPlayer.play("VLC", "documentary.vlc");
        audioPlayer.play("AVI", "file.avi");
    }
}

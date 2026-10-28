package Del1;

public class Song extends MediaItem implements PlayAble {
    private String artist;

    public Song(String title, String artist, int durationInSeconds) {
        super(title, durationInSeconds);
        this.artist = artist;
    }

    public void play() {
        System.out.println("♪ Afspiller: \"" + getTitle() + "\" af " + artist + " (" + getDurationInSeconds() + "s)");
    }
}

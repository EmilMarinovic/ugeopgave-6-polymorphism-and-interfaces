package Del1;

public class AudioBook extends MediaItem implements PlayAble {
    private String author;

    public AudioBook(String title, String author, int durationInSeconds) {
        super(title, durationInSeconds);
        this.author = author;
    }

    public void play() {
        System.out.println("\uD83D\uDCD6 Afspiller: \"" + getTitle() + "\" af " + author + " (" + getDurationInSeconds() + "s)");
    }
}

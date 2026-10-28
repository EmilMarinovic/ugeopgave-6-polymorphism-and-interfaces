package Del1;

public class Podcast extends MediaItem implements PlayAble {
    private String host;

    public Podcast(String title, String host, int durationInSeconds) {
        super(title, durationInSeconds);
        this.host = host;
    }

    public void play() {
        System.out.println("\uD83C\uDF99 Afspiller: \"" + getTitle() + "\" af " + host + " (" + getDurationInSeconds() + "s)");
    }
}

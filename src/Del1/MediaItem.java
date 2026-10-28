package Del1;

abstract class MediaItem {
    private String title;
    private int durationInSeconds;

    public MediaItem(String title, int durationInSeconds) {
        this.title = title;
        this.durationInSeconds = durationInSeconds;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    @Override
    public String toString() {
        return title + ": " + durationInSeconds + "s";
    }
}

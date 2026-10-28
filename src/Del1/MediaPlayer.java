package Del1;

import java.util.ArrayList;

public class MediaPlayer {
    private ArrayList<PlayAble> playlist = new ArrayList<>();

    public void add(PlayAble item) {
        playlist.add(item);
    }

    public void playAll() {
        for (PlayAble s : playlist) {
            s.play();
        }
    }

    public int getTotalDuration() {
        int total = 0;
        for (PlayAble s : playlist) {
            total += s.getDurationInSeconds();
        }
        return total;
    }

    public void printPlaylist() {
        System.out.println("=== Playlist (" + playlist.size() + " elementer) ===");
        for (int i = 1; i < playlist.size(); i++) {
            System.out.println(i + ". " + playlist.get(i).toString());
        }

    }
}

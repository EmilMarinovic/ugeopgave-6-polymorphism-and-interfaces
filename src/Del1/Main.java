package Del1;

public class Main {

    public static void main(String[] args) {
        MediaPlayer mp = new MediaPlayer();
        mp.add(new Song("Ude Fra Indre", "Noah Carter", 200));
        mp.add(new Song("Carbaret", "Gilli", 180));
        mp.add(new Podcast("Elastico", "Hav & Cengiz", 2000));
        mp.add(new Podcast("Hjulspin", "Hav & Kamal", 1000));
        mp.add(new AudioBook("EP 46", "Fjæstid", 1500));
        mp.add(new AudioBook("Den Grimme Ælling", "H.C. Andersen", 2250));

        mp.playAll();

        System.out.println("Samlet varighed: " + mp.getTotalDuration() + " sekunder");
    }
}
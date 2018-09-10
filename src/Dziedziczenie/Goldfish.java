package Dziedziczenie;

public class Goldfish extends Fish {
    @Override
    public String toString() {
        return "Goldfish{" +
                "predkoscPlywania=" + predkoscPlywania +
                ", gatunek='" + gatunek + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }

    public Goldfish(String gatunek, String kolor, int predkoscPlywania) {
        super(gatunek, kolor,predkoscPlywania);


    }
}

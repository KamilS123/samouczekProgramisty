package Dziedziczenie;

abstract class Mammal extends Humal{
    String kolorSkory;

    @Override
    public String toString() {
        return "Mammal{" +
                "kolorSkory='" + kolorSkory + '\'' +
                ", wzrost=" + wzrost +
                ", gatunek='" + gatunek + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }

    public Mammal(String gatunek, String kolor, int wzrost, String kolorSkory) {
        super(gatunek, kolor, wzrost);
        this.kolorSkory = kolorSkory;


    }
}

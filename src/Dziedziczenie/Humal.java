package Dziedziczenie;

public class Humal extends Animal {
    int wzrost;

    @Override
    public String toString() {
        return "Humal{" +
                "wzrost=" + wzrost +
                ", gatunek='" + gatunek + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }

    public Humal(String gatunek, String kolor, int wzrost) {
        super(gatunek, kolor);
        this.wzrost = wzrost;


    }
}

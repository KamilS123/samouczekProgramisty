package Dziedziczenie;

abstract class Animal {
    String gatunek;
    String kolor;

    public Animal(String gatunek, String kolor) {
        this.gatunek = gatunek;
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "gatunek='" + gatunek + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Animal mamal = new Humal("Człekokształtny","Czarny",189);
        Animal goldfish = new Goldfish("Ryba","Zielony",32);

        System.out.println(goldfish instanceof Animal);
        System.out.println(goldfish instanceof Goldfish);
        System.out.println(mamal);
    }
}

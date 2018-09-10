package Dziedziczenie;

abstract class Fish extends Animal{
    int predkoscPlywania;
    public Fish(String gatunek, String kolor,int predkoscPlywania) {
        super(gatunek, kolor);
        this.predkoscPlywania = predkoscPlywania;
    }
}

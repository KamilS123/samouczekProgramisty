package enumZadanie;

enum Kolor_oczu {
    ZIELONY,
    NIEBIESKI,
    CZARNY,
    CZERWONY
}
enum Kolor_wlosow {
    NIEBIESKI,
    ZIELONY,
    FIOLETOWY,
    GRANATOWY;
}

public class Human {
    String imie;
    int wiek;
    Kolor_oczu kolor_oczu;
    Kolor_wlosow kolor_wlosow;

    Human(String imie, int wiek, Kolor_wlosow kolor_wlosow, Kolor_oczu kolor_oczu) {
        this.imie = imie;
        this.wiek = wiek;
        this.kolor_oczu = kolor_oczu;
        this.kolor_wlosow = kolor_wlosow;
    }
    public String toString() {
      return "imie-->" + imie + ", wiek-->" + wiek + ", kolor_wlosów-->" + kolor_wlosow + ", kolor_oczu-->" + kolor_oczu;
    }

    public static void main(String[] args) {
        Human human = new Human("Kamil",23,Kolor_wlosow.FIOLETOWY,Kolor_oczu.CZARNY);
        System.out.println(human);
    }
}
/*Napisz klasę Human, która będzie reprezentowała człowieka. Niech klasa ta posiada atrybuty takie jak imię,
 wiek, kolor oczu, kolor włosów.
Niech te dwa ostatnie atrybuty będą typami wyliczeniowymi. Stwórz instancję takiej klasy.*/
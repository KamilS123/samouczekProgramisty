package testyZadania;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    String nazwa;
    double cena;
    double waga;
    int iloscSztuk;

    public Basket(String nazwa, double cena, double waga, int iloscSztuk) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.waga = waga;
        this.iloscSztuk = iloscSztuk;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", waga=" + waga +
                ", iloscSztuk=" + iloscSztuk +
                '}';
    }
    public static void main(String[] args) {
        List<Basket>lista = new ArrayList<>();
        addElement(lista,new Basket("Kawa",30,2,5));
        addElement(lista,new Basket("Jogurt",30,2,5));
        addElement(lista,new Basket("Mrozonki",30,2,5));
        addElement(lista,new Basket("Cukier",30,2,5));
        showList(lista);
        removeElement(lista,1);
        showList(lista);

    }

    public static void showList(List<Basket>lista) {
        System.out.println(lista + "\n");
    }
    public static List<Basket> addElement(List<Basket>lista, Basket basket) {
        lista.add(basket);
        return lista;
    }
    public static List<Basket> removeElement(List<Basket>lista, int number) {
        lista.remove(number);
        return lista;
    }
}

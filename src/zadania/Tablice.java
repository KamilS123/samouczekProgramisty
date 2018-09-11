package zadania;

import java.util.Arrays;

public class Tablice {
    public static void main(String[] args) {
        zwrocTabStr();
        zwrocOdwrocone();
        wyswietlOdXDo0(15);
        System.out.println("\n");
        wyswietlOdXDokonca(5);
        System.out.println("\n");
        wyswietlOdwroconeWLini(55894);
        zwrocReverse("Kamil");
        czyPolindrom("kajak");
        wyswietlTablice();
        wyswietlPosortowana();
    }
//Napisz metodę, która zwróci tablicę String[] zawierającą pierwsze 5 liter alfabetu,
    public static void zwrocTabStr() {
        char[] chars = new char[5];
        String[] str = new String[chars.length];
        char poczatek = 'a';
        for (int i = 0; i < chars.length; i++) {
            chars[i] = poczatek;
            poczatek++;
        }
        System.out.println(Arrays.toString(chars));
    }
//Napisz metodę pobierającą trójelementową tablicę liczb, która zwróci tablicę zawierającą te same
// elementy w odwróconej kolejności
    public static void zwrocOdwrocone() {
        int[] number = {4, 2, 3,6,9};
        int count = number.length-1;
        int[] number2 = new int[number.length];
        for (int i = 0; i < number.length; i++) {
                number2[count] = number[i];
                count--;
        }
        System.out.println(Arrays.toString(number2));
    }
//Utwórz metodę pobierającą dodatnią liczbę całkowitą X, która wyświetli na ekranie liczby od zera do X,
    public static void wyswietlOdXDo0(int number) {
        for (int i = number; i>0; i--) {
            System.out.print(i + ", ");
        }
    }
//Jeśli w zadaniu 1. użyłeś pętli for przerób tę metodę na while (lub odwrotnie),
    public static void wyswietlOdXDokonca(int number) {
        while(number!=0) {
            System.out.print(number);
            number--;
        }
    }
//Utwórz metodę, która pobierze liczbę i wypisze każdy znak w osobnej linii zaczynając od ostatniej cyfry
// (np. dla liczby 123 będą to trzy linie z 3, 2 i 1),
    public static void wyswietlOdwroconeWLini(int number) {
        while(number>0) {
            int reminder = number%10;
            number/=10;
            System.out.println(reminder);
        }
    }
//Utwórz metodę, która jako argument pobierze obiekt klasy String i zwróci “odwrócony” argument.
// Na przykład “pies” przekształci w “seip”,
    public static void zwrocReverse(String str) {
        StringBuilder strb= new StringBuilder(str);
        strb.reverse();
        System.out.println(strb);
    }
//Utwórz metodę, pobierającą łańcuch znaków, która sprawdzi czy jest on palindromem.
// Np. “kajak” jest palindromem (to samo czytane “od przodu i od tyłu”)
//jednak “kotek” już nie. Może przydać Ci się metoda String#toCharArray
    public static void czyPolindrom(String str) {
        String reverse = String.valueOf(new StringBuffer(str).reverse());
        if(str.equals(reverse)) {
            System.out.println("To jest polindrom");
        } else {
            System.out.println("To nie jest polindrom");
        }
    }
//Napisz metodę, która pobierze tablicę liczb całkowitych i wyświetli ją w postaci “[liczba, liczba, liczba]”,
    public static void wyswietlTablice() {
        int[] number = {23,54,32,12,1,43,21,3};
        System.out.println(Arrays.toString(number));
    }
//Napisz metodę, która pobierze tablicę liczb całkowitych i posortuje ją w kolejności
// od najmniejszej do największej liczby.
// Jednym z podstawowych algorytmów sortowania jest sortowanie bąbelkowe.
    public static void wyswietlPosortowana() {
        int number[] = {3,5,2,1,3,4};
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
    }
}

package zadania;

import java.util.Arrays;
import java.util.Scanner;

public class Tablice_wypelnij {
    public static void main(String[] args) {
    wypisz();
    }
    public static void wypisz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugosc tablicy");
        int dlugoscTablicy = scanner.nextInt();
        int[]tab = new int [dlugoscTablicy];

        for(int i = 0; i<dlugoscTablicy; i++) {
            System.out.println("Podaj liczbe na " + (i + 1) + " element tablicy");
            tab[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(tab));
    }
}
/*Napisz program, który pobierze od użytkownika liczbę całkowitą N reprezentującą długość tablicy,
 a następnie poprosi o N kolejnych liczb uzupełniając nimi wcześniej stworzoną tablicę. Wyświetl na konsoli tablicę
 posortowaną w kolejności od najmniejszej do największej liczby,*/
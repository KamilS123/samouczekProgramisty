import static java.lang.Math.PI;

public class KonwersjaIRzutowanie {
    public static void main(String[] args) {
        wylicz(5);
        czescUlamkowa(5,2);
        //problemoxingu();
        asci();
    }
    public static void wylicz(int number) {
        double c = number*PI;
        int d = (int)c;
        System.out.println(c);
        System.out.println(d);
    }

    public static void czescUlamkowa(int liczba1, int liczba2) {
        double wynik = (double)liczba1/liczba2;
        double reszta = liczba1%liczba2;
        System.out.println(wynik);
    }

    public static void problemoxingu() {
       Double d1 = null;
       double d2 = d1;
        System.out.println(d2);
    }

    public static void asci() {
        char znak = 'c';
        int zmiana = znak;
        System.out.println(zmiana);
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class WyjatkiZadanie {
    public static void main(String[] args) {
        pierwiastek();
    }
    public static void pierwiastek() {
        System.out.println("Podaj numer do obliczenia pierwiastka");
        Scanner scanner = new Scanner(System.in);
        double podanaLiczba = 0;

        while(true){
            try{
                podanaLiczba = scanner.nextDouble();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Podaj Poprawna liczbe");
                scanner.next();
            }
        }
        if(podanaLiczba<0) {
            throw new IllegalArgumentException(String.format("pierwiatek z liczby %.4f nie istnieje",podanaLiczba));
        }
        System.out.println(String.format("Pierwiastek kwadratowy z liczby %.4f to %.4f",podanaLiczba,Math.sqrt(podanaLiczba)));
    }
}

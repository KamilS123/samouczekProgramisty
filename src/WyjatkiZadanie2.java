import java.util.InputMismatchException;
import java.util.Scanner;

public class WyjatkiZadanie2 {
    public static void main(String[] args) {
        wyjatek();
    }

    public static void wyjatek() {
        Scanner scanner = new Scanner(System.in);
        double podanaLiczba = 0;
        System.out.print("Podaj Liczbe");

        while (true) {
            try {
                podanaLiczba = scanner.nextDouble();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Podaj poprawną liczbe");
                scanner.next();
            }
        }
        if(podanaLiczba<0){
            throw new IllegalArgumentException(String.format("Liczba %.4f mniejsza niż zero",podanaLiczba));
        }
        System.out.println(String.format("Pierwiastek drugiego stopnia z %.4f wynosi %.4f",podanaLiczba,Math.sqrt(podanaLiczba)));

    }
}

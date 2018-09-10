import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadanieWyjatki3 {
    public static void main(String[] args) {
        wyjatek();
    }

    public static void wyjatek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        double podana = 0;
        while(true){
            try {
                podana = scanner.nextDouble();
                System.out.println(Math.sqrt(podana));
                break;
            } catch (InputMismatchException ex) {
                System.out.println("To nie jest liczba");
                scanner.next();
            }
            }

        if(podana<0) {
            throw new IllegalArgumentException("Podałeś lczbe ujemna");
        }


    }
}

import java.util.Scanner;

public class TypyProsteObliczanieTemp {
    public static void main(String[] args) {
        double[]temp = new double[7];
        sredniaTemp(temp);
    }
    public static void sredniaTemp(double[]temp) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<temp.length; i++) {
            System.out.print("Podaj temperature nr: " + i + "--> ");
            temp[i] = scanner.nextDouble();
        }

        double suma = 0;
        for(double d : temp) {
            suma = suma + d;
        }
        System.out.println("Srednia wynosi: " + suma/temp.length);
    }
}

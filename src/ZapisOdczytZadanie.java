import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ZapisOdczytZadanie {
    public static void main(String[] args) throws IOException {
        //zapisz();
        wyswietl();
    }
    public static void zapisz() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filePatch;
        String writing;
        FileWriter fileWriter = null;

        try {
            System.out.print("Podaj Patcha: ");
            filePatch = scanner.next();
            fileWriter = new FileWriter(filePatch);
            System.out.print("Podaj coś do pliku: ");
            writing = scanner.nextLine();
            fileWriter.write(writing);
        } finally {
            if(fileWriter!=null) {
                fileWriter.close();
            }
        }
/*Napisz program, który pobierze od użytkownika ścieżkę do pliku tekstowego oraz
kilka linijek tekstu (dopóki użytkownik nie wprowadzi „-” jako linijki) i zapisze je do pliku tekstowego.
 Do wykonania tego zadania może Ci się przydać metoda System.lineSeparator() zwracająca znak nowej linii
(jeśli chciałbyś oddzielić linie wprowadzone przez użytkownika).*/
    }
    public static void wyswietl() throws IOException{
        Scanner scanner = new Scanner(System.in);
        String filePatch;
        String reading;

        BufferedReader bufferedReader = null;
        try {
            System.out.print("Podaj patcha: ");
            //filePatch = scanner.next();
            bufferedReader = new BufferedReader(new FileReader(scanner.next()));
            System.out.println("Zawartosc pliku: ");
            while(true) {
                reading = bufferedReader.readLine();
                if(reading == null) {
                    break;
                }
                System.out.println(reading);
            }

        } finally {
            if(bufferedReader!=null) {
                bufferedReader.close();
            }
        }
    }
}

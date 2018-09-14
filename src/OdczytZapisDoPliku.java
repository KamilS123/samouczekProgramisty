import java.io.*;
import java.util.Scanner;

public class OdczytZapisDoPliku {
    public static void main(String[] args) throws IOException {
       /* try {
            new BufferedReader(new FileReader("C:/Users/T15/Desktop/GIT/samouczekProgramisty/plik.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

       String filePath = "C:/Users/T15/Desktop/GIT/samouczekProgramisty/plik.txt";
       int number = 54646;
       String str = "Coś";
        FileWriter fileWriter = null;
//zapis do pliku
        try {
            fileWriter = new FileWriter(filePath);
           // fileWriter.write(str);
            fileWriter.write(Integer.toString(number));
        } finally {
            if(fileWriter!=null) {
                fileWriter.close();
            }
        }
//odczyt z pliku
        File file = new File(filePath);
        Scanner in = new Scanner(file);
        try{
            String read = in.next();
            System.out.println(read);

        } finally {
            if(in!=null) {
                in.close();
            }
        }


        /*BufferedReader fileReader = null;
        try {
            //fileReader = new BufferedReader(new FileReader("C:/Users/T15/Desktop/GIT/samouczekProgramisty/plik.txt"));
            fileReader = new BufferedReader(new FileReader(filePath));
            String numberAsString = fileReader.readLine();
            number = Integer.parseInt(numberAsString);
        } finally {
            if(fileReader!=null) {
                fileReader.close();
            }
        }*/
    }
}

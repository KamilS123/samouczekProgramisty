import java.util.*;

public class Lambda_Zadanie {
    public static void main(String[] args) {
        wywolajEquals();
zwroc();
    }
    public static void zwroc() {
        Scanner scanner = new Scanner(System.in);
        List<String>lista = new ArrayList<>();
        for(int i = 0; i<4; i++) {
            System.out.println("Podaj Stringa");
            String word = scanner.next();
            lista.add(word);
        }
        lista.sort((a,b)->b.length()-a.length());
        System.out.println(lista);
        /*Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for(String s : lista) {
            System.out.println(s);
        }*/
    }
    public static Object wywolajEquals() {
        return new Object();
    }
}
/*Napisz program, który pobierze o użytkownika cztery łańcuchy znaków, które umieścisz w liście.
Następnie posortuj tę listę używając metody sort. Użyj wyrażenia lambda,
 które posortuje łańcuchy znaków malejąco po długości.*/
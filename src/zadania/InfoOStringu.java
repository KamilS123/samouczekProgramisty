package zadania;

public class InfoOStringu {
    public static void main(String[] args) {
    show("Kamil");
    }
    public static void show(String str) {
        System.out.println("str.length " + str.length());
        String reverse = String.valueOf(new StringBuffer(str).reverse());
        System.out.println("reversed " + reverse);
        if(str.equalsIgnoreCase(reverse)) {
            System.out.println("Polindrom");
        } else {
            System.out.println("Nie polindrom");
        }
    }
}

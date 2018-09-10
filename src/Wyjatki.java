public class Wyjatki {
    public static void main(String[] args) {
        //System.out.println(wypisz(51));
        method1();
    }
//wypisuje wyjątek kiedy number jest wiekszy od 10
    public static int wypisz(int number) {
        if(number>10) {
            throw new IllegalArgumentException("Wieksze niz 10");
        } else {
            return number;
        }
    }
//stos wywołań, jedna metoda wywołuje drugą
    public static void method1() {
        method2();
    }
    public static void method2() {
        method3();
    }
    public static void method3() {
        throw new RuntimeException("BUM!!!!!!");
    }
}

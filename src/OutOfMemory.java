import java.util.Scanner;

public class OutOfMemory {
    public static void main(String[] args) {
        out();
    }
    public static void out() {
        long[]l = new long[120*1024*10240];
    }
}

import java.util.stream.IntStream;

public class Sleep {
    public static void main(String[] args) throws InterruptedException{
        System.out.println(sleeping(20));

    }
    public static int sleeping(int number) throws InterruptedException {
       try {
           Thread.sleep(5000);
       }catch (InterruptedException ex) {
           System.out.println("Blad");
       }
        return number;
    }
}

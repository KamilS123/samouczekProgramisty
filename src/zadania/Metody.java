package zadania;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Metody {
    public static void main(String[] args) {
        Metody metodyMain = new Metody();
        System.out.println(metodyMain.podniesionaDoPotegi(4));

    }
    public boolean czyParzysta(int number) {
        if(number%2==0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean czyPodzielna(int number) {
        if(number%3==0 && number%5==0) {
            return true;
        } else {
            return false;
        }
    }
    public int podniesionaDoPotegi(int number) {
        return (int)Math.pow(number,3);
    }
    public double zwrocPierwiastek(int number) {
        return Math.sqrt(number);
    }

}


class MetodyTest {
    public Metody metody;
    @Test
    public void czyJestParzysta() {
        Metody metody = new Metody();
        int number = 10;
        Assertions.assertTrue(metody.czyParzysta(number),"Liczba nie jest parzysta");
    }
    @Test
    public void czyJestPodzielnaPrzez3i5() {
        Metody metody = new Metody();

        int number = 15;
        Assertions.assertTrue(metody.czyPodzielna(number),"Liczba nie jest podzielna przez 3");
    }
    @Test
    public void czyPodniesionaDoPotegi() {
        Metody metody = new Metody();
        Assertions.assertEquals(27,metody.podniesionaDoPotegi(3));
    }
    @Test
    public void czyPierwiastek() {
        Metody metody = new Metody();
        Assertions.assertEquals(3,metody.zwrocPierwiastek(9));
    }
}
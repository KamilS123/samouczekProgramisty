import java.util.Arrays;

enum TshirtSize {
    S(10,20,30),
    M(15,25,35),
    L(17,27,37),
    XL(27,37,47);
    private int first;
    private int second;
    private int third;

    TshirtSize(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}
public class Enumy {
    private TshirtSize size;
    private String manufacturer;

    public Enumy(TshirtSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Enumy{" +
                "size=" + size +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public static void main(String[] args) {
    enumSwitch();
    Enumy enum1 = new Enumy(TshirtSize.XL,"Blinkee");
    TshirtSize[] tsize1 = TshirtSize.values();
    System.out.println(Arrays.toString(tsize1));
    String tsize2 = TshirtSize.M.name();
        System.out.println(tsize2);
        TshirtSize tsize3 = TshirtSize.valueOf("L");
        System.out.println(tsize3);

       TshirtSize []t = TshirtSize.values();
    }
    public static void enumSwitch() {
        Enumy enum1 = new Enumy(TshirtSize.M,"Sports Direct");
        switch(enum1.size) {
            case S:
                System.out.println("Rozmiar S");
                break;
            case M:
                System.out.println("Rozmiar M");
                break;
            case L:
                System.out.println("Rozmiar L");
                break;
            case XL:
                System.out.println("Rozmiar XL");
                break;
            default:
                System.out.println("Zły rozmiar");
        }
    }
}

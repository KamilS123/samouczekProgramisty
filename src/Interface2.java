interface dodawanie{
    int dodaj(int a, int b);
}
interface odejmowanie{
    int odejmij(int a, int b);
}

public class Interface2 implements dodawanie,odejmowanie{
    @Override
    public int dodaj(int a, int b) {
        return a+b;
    }

    @Override
    public int odejmij(int a, int b) {
        return a-b;
    }
    public static void main(String[] args) {
    Interface2 inter = new Interface2();
        System.out.println(inter.dodaj(3,5));
        System.out.println(inter.odejmij(4,2));

    }
}

interface BakingOven {
    void bakeCookies();

    void bakeBread();
}

interface RoastingOven {
    void roasChicken();
}

public class Interface implements BakingOven, RoastingOven {
    private int time;
    private int temperature;

    @Override
    public void bakeCookies() {
        temperature = 400;
        time = 120;
        start();
    }

    @Override
    public void bakeBread() {
        temperature = 200;
        time = 100;
        start();
    }

    @Override
    public void roasChicken() {
        temperature = 150;
        time = 90;
        start();
    }

    public void start() {
        System.out.println("temp " + temperature + " " + " time" +  time);
    }

    public static void main(String[] args) {
    Interface inter = new Interface();
    inter.bakeBread();
    inter.bakeCookies();
    inter.roasChicken();

    }
}

public class Metody {
    public static void main(String[] args) {
        Metody metody = new Metody();
        System.out.println(metody.check(20));
        System.out.println(metody.zwroc());
        metody.doSomething();
        metody.doSomething2(1);
        metody.checkWeather(15);
        metody.isPositive(-10);

    }
    boolean check(int number) {
        return number>100;
    }
    String zwroc() {
        return "Marek";
    }
    void doSomething() {
        System.out.println("Zwraca coś");
    }
    void doSomething2(int number) {
        if(number>10){
            return;}
        System.out.println("Robi coś 2");
    }

    void checkWeather(double parameter) {
        if(parameter>25) {
            System.out.println("Goraco");
        } else {
            System.out.println("Zimno");
        }
    }
    boolean isPositive(int temperatura) {
        boolean positive = temperatura>0;
        if(positive) {
            System.out.println("Temperature " + temperatura + " is positive");
        } else {
            System.out.println("Temperature " + temperatura + " is negative");
        }
        return positive;
    }
}

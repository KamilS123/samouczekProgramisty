package generyki;

public class Generyki<T> {
    public T fruits;

    public Generyki(T fruits) {
        this.fruits = fruits;
    }
    public T getFruits() {
        return fruits;
    }

    @Override
    public String toString() {
        return "generyki.Generyki{" +
                "fruits=" + fruits +
                '}';
    }

    public static void main(String[] args) {
        Generyki <Apple> appleBox = new Generyki<Apple>(new Apple());
        Generyki <Orange> orangeBox = new Generyki<>(new Orange());
        Orange fruit = orangeBox.getFruits();
    }
}

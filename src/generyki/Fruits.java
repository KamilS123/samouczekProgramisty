package generyki;

public class Fruits<T> {
    private Object fruits;

    public Fruits(Object fruits) {
        this.fruits = fruits;
    }

    public Object getFruits() {
        return fruits;
    }

    public static void main(String[] args) {
        Fruits<Orange> fruits = new Fruits<Orange>(new Orange());
        Orange fruit = (Orange) fruits.getFruits();
    }
}

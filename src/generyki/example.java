package generyki;

public class example <T,S> {
    private T first;
    private S second;

    example(T first,S second) {
        first = first;
        second = second;
    }

    public T getFirst() {
        return first;
    }
    public S getSecond() {
        return second;
    }

    public static void main(String[] args) {
        example <Fruits<Orange>, Fruits<Apple>> pair = new example<>(new Fruits<>(new Orange()),new Fruits<>(new Apple()));
        System.out.println(pair.second);
    }
}

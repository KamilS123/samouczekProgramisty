package enumZadanie;

enum Computation {
    MULTIPLY {public int perform(int a, int b) {return a*b;}},
    DIVIDE{public int perform(int a, int b){return a/b;}},
    ADD{public int perform(int a, int b){return a+b;}},
    SUBSTRACT{public int perform(int a, int b){return a-b;}};

    public abstract int perform(int a, int b);

    public static void main(String[] args) {
        System.out.println(Computation.ADD.perform(2,5));
    }
}

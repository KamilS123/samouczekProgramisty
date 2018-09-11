package zadania;
enum Plec {
    MEZCZYZNA,
    KOBIETA
}

public class Human {
    int age;
    int weight;
    String name;
    Plec plec;

    public Human(int age, int weight, String name, Plec plec) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.plec = plec;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Plec getPlec() {
        return plec;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", plec=" + plec +
                '}';
    }

    public static void main(String[] args) {
        Human human1 = new Human(32,22,"Jaaaaan",Plec.MEZCZYZNA);
        Human human2 = new Human(12,23,"Jan",Plec.KOBIETA);
        System.out.println(human1);
    }
}

import java.util.ArrayList;
import java.util.List;

public class Strumienie {
    String name;
    int maxPlayers;
    int minPlayers;
    double rating;
    double price;

    public Strumienie(String name, int maxPlayers, int minPlayers, double rating, double price) {
        this.name = name;
        this.maxPlayers = maxPlayers;
        this.minPlayers = minPlayers;
        this.rating = rating;
        this.price = price;
    }

    public static void main(String[] args) {
        List<Strumienie>lista = new ArrayList<>();
        lista.add(new Strumienie("Tank",6,3,5.0,120));
        lista.add(new Strumienie("Wiedzmin",8,1,7.0,180));
        lista.add(new Strumienie("Hitman",10,2,6.0,150));
//segregowanie przez pętle
        for(Strumienie s : lista) {
            if(s.maxPlayers>4){
                if(s.minPlayers>1){
                    if(s.rating>5.0) {
                        System.out.println(s.name);
                    }
                }
            }
        }
//wyszukiwanie po streamach
        lista.stream()
                .filter(s->s.rating>5.0)
                .filter(s->s.minPlayers>1)
                .filter((s->s.maxPlayers>4))
                .map(s->s.name.toUpperCase())
                .forEach(System.out::println);
    }
}

/*Lista games zawiera 10 tytułów gier planszowych. Pochodzą one z listy najbardziej popularnych gier
według portalu BGG1. Załóżmy, że chciałbyś zrobić znajomemu prezent. Chcesz kupić grę,
 gra powinna spełniać następujące warunki:

powinna pozwolić na grę w więcej niż 4 osoby,
powinna mieć ocenę wyższą niż 8,
powinna kosztować mniej niż 150 zł.*/

public class Tablice {
    public static void main(String[] args) {
        int[]tab = {1,2,3,4,5};

        wypisz(tab);
        System.out.println("\n");
        wypisz2(tab);
        System.out.println("\n");
        wypiszDo10(tab);
        System.out.println("\n");
        wypiszDo13(tab);
        System.out.println("\n");
        wypiszMalejaco();
        System.out.println("\n");
        wypiszOd10Do20();
        System.out.println("\n");
        wypiszNieparzyste();
        System.out.println("\n");
        wypiszNieparzysteWhile();
        System.out.println("\n");
        System.out.println(zwrocSumeTablicy(tab));



    }
    public static void wypisz(int[]tab) {
        for(int i = 0; i<tab.length; i++) {
            System.out.print(tab[i]);
        }
    }

    public static void wypisz2(int[]tab) {
        for(int i : tab) {
            System.out.print(i);
        }
    }

    public static void wypiszDo13(int[]tab) {
        int number = 10;
        while(number<13) {
            System.out.print(number + ", ");
            number++;
        }
    }

    public static void wypiszDo10(int[]tab) {
        int number2 = 0;
        while(true) {
            System.out.print(number2);
            number2++;

            if(number2==10)
                break;
        }
    }

    public static void wypiszMalejaco() {
        for(int i = 10; i>0; i--) {
            System.out.print(i + " ,");
        }
    }

    public static void wypiszOd10Do20() {
        int number = 10;
        while(true) {
            System.out.print(number + " ,");
            number++;
            if(number==21){
                break;
            }
        }
    }

    public static void wypiszNieparzyste() {
        for(int i = -10; i<=40; i++) {
            if(i%2!=0) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void wypiszNieparzysteWhile() {
        int number = -10;
        while(true) {
            if(number%2!=0) {
                System.out.print(number + ", ");
            }number++;
            if(number==40) {
                break;
            }
        }
    }

    public static int zwrocSumeTablicy(int[]tab) {
        int suma = 0;
        for(int i = 0; i<tab.length; i++) {
            suma = suma + tab[i];
        }
        return suma;
    }
}

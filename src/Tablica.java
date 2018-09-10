import java.util.Arrays;

public class Tablica {
    private Integer[][]board = new Integer[9][9];

    Tablica(Integer[][]board) {
        this.board = board;
    }

    public static void main(String[] args) {
        int [] tab = {1,2,3,4,5};
        System.out.println(suma(tab));
        System.out.println(returnMax(tab));

sudoku();
    }

    public static int suma(int[]tab) {
        int suma = 0;
        for(int i = 0; i<tab.length; i++) {
            suma = suma + tab[i];
        }
        return suma;
    }

    public static int returnMax(int[]tab) {
        int max = tab[0];
        for(int i = 0; i<tab.length; i++) {
            if(max<tab[i]) {
                max = tab[i];
            }
        }
        return max;
    }

    public static Tablica sudoku() {
        Integer[][] board = new Integer[][] {
                new Integer[]{2,null,null,6,null,7,5,null,null},
                new Integer[]{null,null,null,null,null,null,null,9,6},
                new Integer[]{6,null,7,null,null,3,1,null,null},

                new Integer[]{null,5,null,7,3,2,null,null,null},
                new Integer[]{null,7,null,null,null,null,null,2,null},
                new Integer[]{null,null,null,1,8,9,null,7,null},

                new Integer[]{null,null,3,5,null,null,6,null,4},
                new Integer[]{4,8,null,null,null,null,null,null,null},
                new Integer[]{null,null,5,2,null,6,null,null,8}
        };

           return new Tablica(board);
        }
    }


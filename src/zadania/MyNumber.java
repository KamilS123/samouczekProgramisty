package zadania;

public class MyNumber {
    int number;

    MyNumber(int number) {
        this.number = number;
    }

    public boolean isOdd(int myNumber) {
        if(myNumber%2==0) {
            return false;
        } else {
            return true;
        }
    }
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(10);
        myNumber.isOdd(10);
    }
}

public class PierwszyProgram {
    public static void main(String[] args) {
        String message1 = "To jest program ";
        String message2 = " który przewiduje ";
        String message3 = "pogode";
    int leng = message1.trim().length() + message2.length() + message3.length();
        System.out.println(leng);
    }
}

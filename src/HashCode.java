public class HashCode {
    String name;
    String surname;

    public HashCode(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static void main(String[] args) {
        HashCode hash1 = new HashCode("Kamil","Superson");
        HashCode hash2 = new HashCode("Kamil","Superson");
        System.out.println(hash1.equals(hash2));
        System.out.println(hash1.equals(hash1));
        int code1 = hash1.hashCode();
        int code2 = hash2.hashCode();
        System.out.println(code1==code2);
        System.out.println(code1);
        System.out.println(code1*2);
        System.out.println(code2);
    }
}

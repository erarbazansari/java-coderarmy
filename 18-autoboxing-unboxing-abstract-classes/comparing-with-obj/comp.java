
public class comp {
    public static void main(String[] args) {
        // int x = 100;
        // int y = 100;
        // System.out.println(x == y); // true

        // Integer obj
        Integer a = 200;
        Integer b = 200;
        System.out.println(a == b); // false
        System.err.println(a.equals(b)); // true
        System.err.println(a.intValue() == b.intValue()); // true
    }
}

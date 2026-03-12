public class boxing {
    public static void main(String[] args) {
        // autoboxing
        int x = 100;
        Integer value = x;

        System.out.println(value.intValue());
        

        // null pointer exception
        // Integer updated = null;
        // int me = updated; // java.lang.NullPointerException

        // System.err.println(me);
    }
}
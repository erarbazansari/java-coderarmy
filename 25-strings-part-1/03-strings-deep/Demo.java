
public class Demo {
    public static void main(String[] args) {
        String s1 = "he" + "llo";
        String s2 = "hello";
        // System.out.println(s1 == s2); // true => compiler optimize the code
        // System.out.println(s1.equals(s2)); // true => .equals() check value

        String s3 = "hello";
        String s4 = s3 + " world"; // here " world" => literal => stored in string pool => and removed by gc
        String s5 = "hello world";
        String s6 = " world";

        // System.out.println(s4 == s5); // false
        // System.out.println(s4.equals(s5)); // true

        String s7 = "arbaz";
        String s8 = s7;
        // System.out.println(s7 == s8); // true
        // System.out.println(s7.equals(s8)); // true

        String s9 = "hello";
        s9 = "world"; // and note => after something => hello will not be in pool => removed by gc
        System.out.println(s9);
    }
}


public class Demo {
    public static void main(String[] args) {
        String s1 = "hello"; // literal way => stored in string pool
        String s2 = "hello";
        String s5 = "arbaz";

        System.out.println("literal way => stored in string pool");
        System.out.println(s1 == s2);// true => == check refrence
        System.out.println(s1.equals(s2));// true => .equals() check value
        System.out.println(s1 == s5);// false
        System.out.println(s1.equals(s5));// false

        System.out.println("new keyword => stored in heap");
        String s3 = new String("hello"); // new keyword => stored in heap
        String s4 = new String("hello");

        System.out.println(s3 == s4);// false => == check refrence
        System.out.println(s3.equals(s4));// true => .equals() check value
    }
}


public class Demo {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = new String("");
        String s3 = new String();
        String s4 = new String("ansari");

        char[] ch = { 'a', 'r', 'b', 'a', 'z' };
        String name = new String(ch);
        String new_name = new String(ch, 0, 3);
        byte[] abc = { 97, 98, 99 };
        String abc2 = new String(abc);

        // using string builder and buffer
        StringBuilder sb = new StringBuilder("arbaz ansari");
        String s5 = new String(sb);

        StringBuffer sbf = new StringBuffer("arbaz ansari");
        String s6 = new String(sbf);

        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);
        // System.out.println(s4);
        // System.out.println(name);
        // System.out.println("new name: " + new_name);
        // System.out.println(abc2);
        // System.out.println(s5);
        // System.out.println(s6);
    }
}

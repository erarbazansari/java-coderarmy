
public class Demo {
    public static void main(String[] args) {
        // upcasting
        String name = new String("Arbaz Ansari");
        // System.out.println(name);

        Object obj = name; // upcasting
        // System.out.println(obj);
        // System.out.println(obj.getClass());

        // downcasting
        Object obj2 = "arbaz";
        // String name2 = obj2; // compile not sure here => to it will give exception
        String name2 = (String) obj2; // downcasting => and we can use all the methods of String class too
        // System.out.println(name2);
        // System.out.println(name2.getClass());
        // System.out.println(name2.toUpperCase());

        // another example
        Object obj3 = 10;
        System.out.println(obj3);
        System.out.println(obj3.getClass());

        String f = (String) obj3;
        System.out.println(f);
        System.out.println(f.getClass());

    }
}

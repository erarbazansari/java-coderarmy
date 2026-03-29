
public class Demo {
    public static void main(String[] args) {
        Integer num = 100;
        System.out.println(work(num).intValue() + 10); // here work(<T>); T is generic here

        String name = "Arbaz";
        System.out.println(work(name).charAt(3));

        // another example
        show(10, "Arbaz");
        show(true, "happy");
        show("price", 1000.50);
    }

    public static <T> T work(T num) {
        return num;
    }

    public static <T, U> void show(T t, U u) {
        System.out.println(t + " " + u);
    }
}


public class Demo {
    public static void main(String[] args) {
        MyClass<Double> m1 = new MyClass<Double>(10.5);
        MyClass<Integer> m2 = new MyClass<Integer>(200);
        MyClass<String> m3 = new MyClass<String>("Arbaz Ansari");
        MyClass<Boolean> m4 = new MyClass<>(true); // <> will infer the type from the constructor argument

        // System.out.println("Generic Double Example");
        // System.out.println(m1);
        // System.out.println(m1.getData().doubleValue() + 10.5000);
        // System.out.println(m1.getClass());

        // System.out.println("\nGeneric Integer Example");
        // System.out.println(m2);
        // System.out.println(m2.getData().intValue() + 500);
        // System.out.println(m2.getClass());

        // System.out.println("\nGeneric String Example");
        // System.out.println(m3);
        // System.out.println(m3.getData().concat(" Ansari").toLowerCase());
        // System.out.println(m3.getClass());

        // System.out.println("\nGeneric Boolean Example");
        // System.out.println(m4);
        // System.out.println(m4.getData().booleanValue());
        // System.out.println(m4.getClass());

        // another example
        Pair<Integer, String> p1 = new Pair<>(100, "world");
        // System.out.println(p1);
        // System.out.println(p1.getPair()[0]);
        // System.out.println(p1.getPair()[1]);

        // p1.updatePair(300, "world");
        // System.out.println(p1.getPair()[0]);
        // System.out.println(p1.getPair()[1]);
    }
}

class MyClass<T> { // <T> is a type parameter
    private T obj;

    MyClass(T obj) {
        this.obj = obj;
    }

    // getter
    public T getData() {
        return this.obj;
    }

    // setter
    public void setData(T obj) {
        this.obj = obj;
    }

}

class Pair<T, U> {
    private T first;
    private U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public Object[] getPair() {
        return new Object[] { this.first, this.second };
    }

    public void updatePair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}
public class Demo {
    public static void main(String[] args) {
        // B b = new B();
        // b.show();

        A a = new B();
        a.show();

        A.whoami();
    }
}

// after java 8 => introced default methods, static methods
// after java 9 => private methods is also introduced
interface A {
    default void show() { // default method
        System.out.println("default method");
        accelerate();
    }

    static void whoami() {
        System.out.println("I am A");
    }

    private void accelerate() {
        System.out.println("accelerating A speed!");
    }
}

class B implements A {
    // public void show() { // overriding default method => now this is optional
    // System.out.println("overriding default method");
    // }
}
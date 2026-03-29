
public class Demo {
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}

interface A {
    default void show() {
        System.out.println("inside A interface");
    }

}

class B {
    public void show() {
        System.out.println("inside B class");
    }
}

class C extends B implements A {
    public void show() {
        System.out.println("inside C class");
    }
}
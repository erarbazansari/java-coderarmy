
public class Demo {
    public static void main(String[] args) {
        C c = new C();
        c.show();
        c.display();
    }
}

// multiple inheritance using interface

interface A {
    void show();
}

interface B {
    void display();
}

class C implements A, B {
    public void show() {
        System.out.println("show");
    }

    public void display() {
        System.out.println("display");
    }
}

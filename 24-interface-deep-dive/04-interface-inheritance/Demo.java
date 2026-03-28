
public class Demo {
    public static void main(String[] args) {
        C c = new C();
        c.show1();
        c.show2();
    }
}

// interface inheritance
interface A {
    void show1();
}

interface B extends A {
    void show2();
}

class C implements B {
    @Override
    public void show1() {
        System.out.println("showing 1");
    }

    @Override
    public void show2() {
        System.out.println("showing 2");
    }
}

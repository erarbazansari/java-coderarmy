
public class Demo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add();
        calculator.sub();
    }
}

// variables in interface are always public static final
interface MathematicsConstants {
    int a = 10; // by default public, statice, and final
    int b = 20;

    void add();

    void sub();
}

class Calculator implements MathematicsConstants {
    public void add() {
        System.out.println(MathematicsConstants.a + MathematicsConstants.b);
    }

    public void sub() {
        System.out.println(MathematicsConstants.a - MathematicsConstants.b);
    }
}
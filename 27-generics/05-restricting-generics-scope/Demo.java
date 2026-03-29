
public class Demo {
    public static void main(String[] args) {
        Hello<Double> h = new Hello<>(10.5);
        h.show();
        h.value = 500.5;
        h.show();
    }
}

class Hello<T extends Number> {

    T value;

    Hello(T value) {
        this.value = value;
    }

    public void show() {
        System.out.println(this.value);
    }
}
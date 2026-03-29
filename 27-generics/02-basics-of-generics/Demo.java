
public class Demo {
    public static void main(String[] args) {
        MyClass m1 = new MyClass(10.5);

        // we lost the type saftey so we have to downcast how
        // String s = (String) m1.getData();
        // System.out.println(s);
        // System.out.println(s.length());
        // System.out.println(s.toUpperCase());
        // System.out.println(s.getClass());

        // into Integer
        // Integer n = (Integer) m1.getData();
        // System.out.println(n);
        // System.out.println(n.intValue());
        // System.out.println(n.getClass());

        // into double
        Double d = (Double) m1.getData();
        System.out.println(d);
        System.out.println(d.doubleValue());
        System.out.println(d.getClass());
    }
}

class MyClass {
    private Object obj;

    MyClass(Object obj) {
        this.obj = obj;
    }

    // getter
    public Object getData() {
        return this.obj;
    }

    // setter
    public void setData(Object obj) {
        this.obj = obj;
    }

}
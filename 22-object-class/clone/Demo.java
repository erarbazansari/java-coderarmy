public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("arbaz", 21);

        Student s2 = (Student) s1.clone();
        System.out.println(s2.name);
        System.out.println(s2.roll);
    }
}

class Student implements Cloneable {
    String name;
    int roll;

    Student(String n, int roll) {
        this.name = n;
        this.roll = roll;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
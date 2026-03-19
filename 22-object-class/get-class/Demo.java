public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("arbaz", 21);
        Student s2 = new Student("arbaz", 21);

        System.out.println(s1.getClass().getName());
        System.out.println(s2.getClass().getName());
        System.err.println(s1 instanceof Student);
        System.err.println(s1 instanceof Object);
    }
}

class Student {
    String name;
    int roll;

    Student(String n, int roll) {
        this.name = n;
        this.roll = roll;
    }
}
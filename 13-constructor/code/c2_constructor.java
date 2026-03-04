public class c2_constructor {
    public static void main(String[] args) {
        Student s1 = new Student(24018, 21, "dce", "arbaz");
        System.err.println("\nStudent 1");
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.name);
        System.out.println(s1.college);
        System.err.println(s1.isHappy);

        Student s2 = new Student();
        System.err.println("\nStudent 2");
        System.err.println(s2.isHappy);
        System.err.println(s2.name);
        System.err.println(s2.rollNumber);
    }
}

class Student {
    int rollNumber;
    int age;
    String college;
    String name;
    boolean isHappy;

    // parameterized constructor
    Student(int rollNo, int age, String college, String name) {
        this.age = age;
        this.college = college;
        this.name = name;
        this.rollNumber = rollNo;
    }

    // default constructor
    Student() {
        this.isHappy = true;
    }
}
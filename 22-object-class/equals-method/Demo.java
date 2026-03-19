
public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("arbaz");
        Student s2 = new Student("arbaz");

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
}

class Student {
    String name;

    Student(String n) {
        this.name = n;
    }

    // @Override
    // public boolean equals(Object obj) {
    // Student s = (Student) obj;
    // return (this.name == s.name);
    // }
}
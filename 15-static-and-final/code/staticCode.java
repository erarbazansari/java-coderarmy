
public class staticCode {
    public static void main(String[] args) {
        Student s1 = new Student(1, "arbaz", 18);
        Student s2 = new Student(2, "vivek", 19);
        // Student.college = "iit delhi"; => or use static block

        System.out.print(s1.name + "-" + s1.rollNumber + "-" + s1.age + Student.college + "\n");
        System.out.print(s2.name + "-" + s2.rollNumber + "-" + s2.age + Student.college);

    }
}

class Student {
    int rollNumber;
    String name;
    int age;
    // static String college = "iit mumbai"; => iit mumbai is defualt
    static String college;

    Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    // static block
    static {
        college = "iit gurgaon";
    }
}

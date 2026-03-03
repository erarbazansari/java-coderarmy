public class oops {
    public static void main(String[] args) {
        Students s1 = new Students(1, "arbaz", 21, "dce");
        Students s2 = new Students(2, "vivek", 22, "iit delhi");

        s1.markAttandence();
        s2.markAttandence();
        s1.printInfo();
    }
}

class Students {
    int rollNumber;
    String name;
    int age;
    String college;

    Students(int rollno, String name, int age, String college) {
        this.rollNumber = rollno;
        this.name = name;
        this.age = age;
        this.college = college;
    }

    void markAttandence() {
        System.out.println("attendence marked by: " + this.name);
    }

    void printInfo() {
        System.out.println("Roll No: " + this.rollNumber);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("College: " + this.college);
    }
}
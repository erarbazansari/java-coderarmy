import java.util.Objects;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("arbaz", 21);
        Student s2 = new Student("arbaz", 21);

        System.out.println(s1.equals(s2));
        System.err.println(s1.hashCode() == s2.hashCode());
    }
}

class Student {
    String name;
    int roll;

    Student(String n, int roll) {
        this.name = n;
        this.roll = roll;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null) {
            return false;
        }

        // checking if both classes are of type student
        // if not checked => Class Cast Exceptions
        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Student s = (Student) obj;

        return (this.name == s.name && this.roll == s.roll);
    }

    @Override
    public int hashCode() {
        // int result = 17;
        // result = result * 31 + this.roll;
        // result = result * 31 + this.name.hashCode();
        // return result;

        // or we can do the same with
        return Objects.hash(name, roll);
    }
}
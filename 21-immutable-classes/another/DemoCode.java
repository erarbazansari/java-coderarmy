public class Demo {
    public static void main(String[] args) {

        College c = new College("DCE", "GGn");

        Student s1 = new Student("arbazansari", 222, c);
        System.out.println(s1.getName());
        System.out.println(s1.getRollNumber());
        System.out.println(s1.getCollege().getName());
        System.out.println(s1.getCollege().getAddress());

    }
}

final class Student {
    private final String name;
    private final int roll;
    private final College college;

    Student(String name, int roll, College college) {
        this.name = name;
        this.roll = roll;
        // Deep copy - create new College instance to prevent external modifications
        this.college = new College(college.getName(), college.getAddress());
    }

    // getters
    public int getRollNumber() {
        return this.roll;
    }

    public String getName() {
        return this.name;
    }

    public College getCollege() {
        // Deep copy - return new instance to prevent external modifications
        return new College(this.college.getName(), this.college.getAddress());
    }
}

final class College {
    private final String name;
    private final String address;

    College(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }
}
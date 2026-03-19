class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Arbaz";
        s1.rollNumber = 24;

        System.out.println("name: " + s1.name);
        System.out.println("roll: " + s1.rollNumber);

        // same
        System.out.println(s1.toString());
        System.out.println(s1); // internally it will automatically call toString() method in class
    }
}

class Student {
    String name;
    int rollNumber;

    // now let's override toString() -> just trying to see
    // @Override
    // public String toString() {
    // return (this.name + " " + this.rollNumber);
    // }
}
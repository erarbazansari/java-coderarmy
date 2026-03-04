public class c1_default_values {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.name);
        System.out.println(s1.college);
    }
}

// for local values => there is no default values

/**
 * default values
 * int -> 0
 * String -> null (nothing)
 * floating -> 0.0
 * Boolean -> false
 * Note -> all non premitive data types we have -> default value -> null
 */

class Student {
    int rollNumber; // default value for int -> 0
    int age;
    String college; // default value for String -> null
    String name;
}
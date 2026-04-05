import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Dog ani = new Dog();
        ani.eat();
        ani.walk();
        ani.bark();

        Animal ani2 = new Dog();
        ani2.eat();
        ani2.walk();
        // ani2.bark(); // error

        // List<Dog> dogs = new ArrayList<>();
        // List<Animal> animals = dogs; // error

        // risky way
        Dog[] dogs = new Dog[10];
        Animal[] animals = dogs;
    }
}

class Animal {

    public void eat() {
        System.out.println("animal can eat");
    }

    public void walk() {
        System.out.println("animal can walk");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("dog can bark");
    }
}
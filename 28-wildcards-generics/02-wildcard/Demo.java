import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        fun(dogs);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        fun(animals);
    }

    // public static void fun(List<Animal> animals) {
    // for (Animal animal : animals) {
    // if (animal == null) {
    // continue;
    // }
    // animal.eat();
    // }
    // }

    public static void fun(List<?> values) {
        for (Object obj : values) {
            if (obj == null) {
                continue;
            }
            if (obj.getClass().getName() == "Animal") {
                System.out.println("animal can eat");
            }
            if (obj.getClass().getName() == "Dog") {
                System.out.println("dog can eat");
            }
        }
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

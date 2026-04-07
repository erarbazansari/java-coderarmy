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

    public static void fun(List<? extends Animal> values) {
        for (Animal a : values) {
            if (a == null) {
                continue;
            }
            a.eat();
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
    @Override
    public void eat() {
        System.out.println("dog can eat");
    }

    public void bark() {
        System.out.println("dog can bark");
    }
}

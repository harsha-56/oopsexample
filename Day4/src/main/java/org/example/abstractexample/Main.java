package org.example.abstractexample;

// Abstract class
abstract class Animal {
    String name;

    // Abstract method (to be implemented by subclasses)
    abstract void makeSound();

    // Concrete method
    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Subclass implementing abstract class
class Dog extends Animal {
    // Implementing abstract method
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.name = "Buddy";
        dog.makeSound(); // Outputs: Bark
        dog.eat();       // Outputs: Buddy is eating.
    }
}

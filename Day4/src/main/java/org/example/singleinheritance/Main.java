package org.example.singleinheritance;

// Superclass
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.bark(); // Method of Dog
    }
}

package org.example.hybridinheritance;

// Interface for Flying behavior
interface Flyer {
    void fly();
}

// Interface for Swimming behavior
interface Swimmer {
    void swim();
}

// Superclass for Animals
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Subclass inheriting from Animal and implementing Flyer interface
class Bird extends Animal implements Flyer {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

// Subclass inheriting from Animal and implementing Swimmer interface
class Fish extends Animal implements Swimmer {
    @Override
    public void swim() {
        System.out.println("Fish is swimming.");
    }
}

// Subclass inheriting from Bird and Fish, demonstrating "hybrid" inheritance
class Duck extends Bird implements Swimmer {
    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.eat();   // Calls eat method from Animal
        duck.fly();   // Calls fly method from Flyer interface (inherited from Bird)
        duck.swim();  // Calls swim method from Swimmer interface (implemented in Duck)
    }
}

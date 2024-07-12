package org.example.multipleinheritance;

// Interface for Swimming behavior
interface Swimmer {
    void swim();
}

// Interface for Flying behavior
interface Flyer {
    void fly();
}

// Concrete class implementing both interfaces
class Bird implements Swimmer, Flyer {
    @Override
    public void swim() {
        System.out.println("Bird is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.swim(); // Calls swim method from Swimmer interface
        bird.fly();  // Calls fly method from Flyer interface
    }
}

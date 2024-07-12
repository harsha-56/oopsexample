package org.example.compositionexample;

// Engine class used in composition
class Engine {
    void start() {
        System.out.println("Engine started.");
    }
}

// Car class using composition
class Car {
    private String model;
    private Engine engine;  // Composition

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void startCar() {
        engine.start();  // Delegates functionality to Engine class
        System.out.println(model + " is ready to go.");
    }
}

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car("Toyota Camry", engine);
        car.startCar(); // Outputs: Engine started. Toyota Camry is ready to go.
    }
}

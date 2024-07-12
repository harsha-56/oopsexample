package org.example.q2;

public class Car {
    // Properties (attributes)
    private String model;
    private int year;
    private String color;

    // Constructor
    /**A constructor in Java is a special method used to initialize objects.
    It is called when an object of a class is created. Constructors have the same name as the class
    and do not have a return type. They are used to set initial values for the object's properties*/
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Getter and Setter methods
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}

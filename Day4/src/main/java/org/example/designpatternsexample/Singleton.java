package org.example.designpatternsexample;


public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton!");
    }
}

class Main {
    public static void main(String[] args) {
        Singleton singleInstance = Singleton.getInstance();
        singleInstance.showMessage();
    }
}

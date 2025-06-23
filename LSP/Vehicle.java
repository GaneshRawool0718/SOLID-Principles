package LSP;

abstract class Vehicle {
    // Liskov Substitution Principle (LSP) Example
    // Base class for vehicles that can be extended without modifying this class.
    public abstract void start();
}

class ElectricVehicle extends Vehicle {
    // ElectricVehicle class extends Vehicle and provides specific implementation for electric vehicles.
    @Override
    public void start() {
        System.out.println("Electric vehicle is starting.");
    }
    public void charge() {
        System.out.println("Electric vehicle is charging.");
    }
}

class HondaCivic extends Vehicle {
    // HondaCivic class extends Vehicle and provides specific implementation for Honda Civic vehicles.
    @Override
    public void start() {
        System.out.println("Honda Civic is starting.");
    }
    public void petrol() {
        System.out.println("Honda Civic is running on petrol.");
    }
}

class Ather extends ElectricVehicle {
    
    @Override
    public void start() {
        System.out.println("Ather is starting with electric power.");
    }
    @Override
    public void charge() {
        System.out.println("Ather is charging at a fast rate.");
    }
}

class PasionPro extends HondaCivic {
    // PasionPro class extends HondaCivic and provides specific implementation for Pasion Pro vehicles.
    @Override
    public void start() {
        System.out.println("Pasion Pro is starting with petrol.");
    }
    @Override
    public void petrol() {
        System.out.println("Pasion Pro is running on petrol.");
    }
}

class Client {
    // Client class to demonstrate the usage of Vehicle and its subclasses
    // It creates instances of Ather and PasionPro, which are subclasses of Vehicle.
    public static void main(String[] args) {
        // Client class to demonstrate the usage of Vehicle and its subclasses
        // Using Vehicle and its subclasses Ather and PasionPro
        Vehicle v1 = new Ather();
        v1.start(); // Outputs: Ather is starting with electric power.

        Vehicle v2 = new PasionPro();
        v2.start(); // Outputs: Pasion Pro is starting with petrol.
    }
}
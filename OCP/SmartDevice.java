package OCP;

public class SmartDevice {
    // Open/Closed Principle (OCP) Example
    // Base class for smart devices that can be extended without modifying this class.
    public void turnOn() {
        // Default implementation for turning on the device
        // This method can be overridden by subclasses to provide specific behavior.
        System.out.println("Smart device is now ON.");
    }
}

class SmartLight extends SmartDevice {
    // SmartLight class extends SmartDevice and provides specific implementation for turning on the light.
    @Override
    public void turnOn() {
        // Specific implementation for turning on the smart light
        System.out.println("Smart light is now ON.");
    }
}

class Client {
    public static void main(String[] args) {
        // Client class to demonstrate the usage of SmartDevice and its subclass SmartLight
        SmartDevice device = new SmartDevice();
        device.turnOn(); // Outputs: Smart device is now ON.
    }
}
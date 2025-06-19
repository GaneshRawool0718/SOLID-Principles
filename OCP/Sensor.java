package OCP;
 
class Sensor {
    // Open/Closed Principle (OCP) Example
    // Base class for sensors that can be extended without modifying this class.
    void readData() {
        System.out.println("Reading sensor data...");
    }
}

class TemperatureSensor extends Sensor {
    // TemperatureSensor class extends Sensor and provides specific implementation for reading temperature data.
    @Override
    void readData() {
        System.out.println("Reading temperature");
    }
}

class Client {
    // Client class to demonstrate the usage of Sensor and its subclasses
    public static void main(String[] args) {
        // Using Sensor and its subclass TemperatureSensor
        Sensor sensor = new TemperatureSensor();
        sensor.readData(); // Outputs: Reading temperature
    }
}


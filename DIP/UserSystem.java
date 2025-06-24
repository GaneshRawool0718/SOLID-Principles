package DIP;

// Dependency Inversion Principle (DIP) Example
// High-level modules should not depend on low-level modules. Both should depend on abstractions.

interface Keyboard {
    void type();
}

class USBKeyboard implements Keyboard {
    // USBKeyboard class implements the Keyboard interface
    // This class provides a specific implementation for typing with a USB keyboard.
    @Override
    public void type() {
        System.out.println("Typing with USB keyboard");
    }
}

class BluetoothKeyboard implements Keyboard {
    // BluetoothKeyboard class implements the Keyboard interface
    // This class provides a specific implementation for typing with a Bluetooth keyboard.
    @Override
    public void type(){
        System.out.println("Typing with bluetooth keyboard");
    }
}

class Computer {
    // Computer class depends on the Keyboard interface, not on specific keyboard implementations.
    Keyboard keyboard ;

    Computer(Keyboard keyboard){
        this.keyboard = keyboard;
    }

    void start() {
        keyboard.type();
    }
}


public class UserSystem {
    // UserSystem class to demonstrate the usage of Computer and its keyboards
    // It creates instances of USBKeyboard and BluetoothKeyboard, which are implementations of the Keyboard interface
    public static void main(String [] args) {

        // UserSystem class to demonstrate the usage of Computer and its keyboards
        // Using Computer and its keyboards USBKeyboard and BluetoothKeyboard
        USBKeyboard usb = new USBKeyboard();
        Computer cp = new Computer(usb);

        cp.start();

        // Now using BluetoothKeyboard
        // This demonstrates that the Computer class can work with any keyboard that implements the Keyboard interface.
        BluetoothKeyboard ble = new BluetoothKeyboard();
        Computer newCp = new Computer(ble);

        newCp.start();

    }
    
}

package DIP;

interface Chef {
    void cook();
}
class PastaChef implements Chef {
    // PastaChef class implements the Chef interface
    @Override 
    public void cook(){
        System.out.println("Cooking Pasta");
    }
}

class PizzaChef implements Chef {
    // PizzaChef class implements the Chef interface
    // This class provides a specific implementation for cooking pizza.
    @Override
    public void cook() {
        System.out.println("Cooking pizza");
    }
}

public class Hotel {
    // Hotel class depends on the Chef interface, not on specific chef implementations.
    // This allows the Hotel class to work with any chef that implements the Chef interface.

    private Chef chef;
    Hotel(Chef chef) {
        this.chef = chef;
    }

    public void make() {
        chef.cook();
    }
}

class Client {
    // Client class to demonstrate the usage of Hotel and its chefs
    // It creates instances of PastaChef and PizzaChef, which are implementations of the Chef interface
    public static void main (String [] args) {
        // Client class to demonstrate the usage of Hotel and its chefs
        // Using Hotel and its chefs PastaChef and PizzaChef
        PastaChef pc = new PastaChef();
        Hotel hotel = new Hotel(pc);
        hotel.make();

        // Now using PizzaChef
        // This demonstrates that the Hotel class can work with any chef that implements the Chef interface.

        PizzaChef pic = new PizzaChef();
        Hotel newHotel = new Hotel(pic);
        newHotel.make();
    }
}

package SRP;

public class DeliveryBoy {

    // Task 1: Pick up the food
    public void pickUpFood() {
        System.out.println("Picking up the food from the restaurant.");
    }

    // Task 2: Ride the bike
    public void rideBike() {
        System.out.println("Riding the bike to deliver the food.");
    }

    // Task 3: Call the customer
    public void callCustomer() {
        System.out.println("Calling the customer to confirm delivery address.");
    }

    // Task 4: Hand over the food
    public void handOverFood() {
        System.out.println("Handing over the food to the customer.");
    }

    // Responsibility: Deliver food
    public void deliverFood() {
        pickUpFood();
        rideBike();
        callCustomer();
        handOverFood();
    }
}
class Client {
    public static void main(String[] args) {
        DeliveryBoy deliveryBoy = new DeliveryBoy();
        deliveryBoy.deliverFood();  
    }
}


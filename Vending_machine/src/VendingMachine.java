import java.util.ArrayList;

public class VendingMachine {
    public void initialize(int id) {
        System.out.println("Welcome to vending machine no. : " + id);
    }

    private int capacity;
    public void getCapacity() {
        System.out.println("Capacity of this machine : " + capacity);
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void displayProduct(ArrayList<String> product) {
        System.out.println("Currently there are " + product.size() + " items");
        System.out.println(product);
    }
}

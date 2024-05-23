import java.util.ArrayList;

public class People implements User, Admin{
    @Override
    public void orderItem(String item) {
        System.out.println(item + " ordered, please complete payment");
    }

    @Override
    public void makePayment(int amount) {
        System.out.println("Payment of amount " + amount + " successful");
    }

    @Override
    public void collectItem(String item, ArrayList<String> product) {
        product.remove(item);
    }

    @Override
    public void addItem(String item, ArrayList<String> product) {
        product.add(item);
    }

    @Override
    public void removeItem(int index, ArrayList<String> product) {
        product.remove(index);
    }
}
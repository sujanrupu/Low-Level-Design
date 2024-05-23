import java.util.ArrayList;

public interface User {
    public void orderItem(String item);
    public void makePayment(int amount);
    public void collectItem(String item, ArrayList<String> product);
}

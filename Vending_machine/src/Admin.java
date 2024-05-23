import java.util.ArrayList;

public interface Admin {
    public void addItem(String item, ArrayList<String> product);
    public void removeItem(int index, ArrayList<String> product);
}

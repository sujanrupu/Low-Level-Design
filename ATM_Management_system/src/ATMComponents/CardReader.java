package ATMComponents;

public interface CardReader {
    public void insertCard(int cardNumber);
    public void showHolderName(String name);
    public void updateActivity();
    public void insertAmount(int amount);
}

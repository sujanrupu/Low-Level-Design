package ATMComponents;

public class ATMManager implements CardReader, Keypad, Screen, CashDispenser, Printer, NetworkInfrastructure {
    @Override
    public void insertCard(int cardNumber) {
        System.out.println("Card inserted of number: " + cardNumber);
    }

    @Override
    public void showHolderName(String name) {
        System.out.println("Welcome : " + name);
    }

    @Override
    public void updateActivity() {
        System.out.println("Account activity updated");
    }

    @Override
    public void insertAmount(int amount) {
        System.out.println("Amount inserted of Rs.: " + amount);
    }

    @Override
    public void ValidateKeyOperation() {
        System.out.println("All key performance validated and OK");
    }

    @Override
    public void checkKeyActivity() {
        System.out.println("All key activity will be tracked by the bank system management for security purpose");
    }

    @Override
    public void screenDiameter(int height, int width) {
        System.out.println("Screen diameter : " + height + " x " + width);
    }

    @Override
    public void screenDisplay(int display) {
        System.out.println("Screen display quality is : " + display + "p");
    }

    @Override
    public void searchAmount(int amount) {
        System.out.println("Amount " + amount + " found at machine");
    }

    @Override
    public void validateAmount(int amount) {
        System.out.println("Amount " + amount + " validated form bank and can be provided to you");
    }

    @Override
    public void setPrintAmount(int amount) {
        System.out.println("Amount " + amount + " will be printed on receipt");
    }

    @Override
    public void printReceipt() {
        System.out.println("Receipt generated and delivered");
    }

    @Override
    public void updateInformation() {
        System.out.println("Account activity updated in bank database");
    }
}

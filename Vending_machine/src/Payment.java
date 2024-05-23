public class Payment {
    public void makePayment(int amount) {
        System.out.println("Rs.: " + amount + " successfully debited");
    }

    public void provideChange(int amount) {
        System.out.println(amount + " change provided");
    }

    public void payExtra(int amount) {
        System.out.println("You more have to pay, Rs.: " + amount);
    }
}

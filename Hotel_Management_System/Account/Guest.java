package Account;

public interface Guest {
    public void checkAvailability(String date, String roomType);
    public void bookRoom();
    public void payment(int amount);
    public void idVerification(int aadhar);
    public void paymentConfirmation(int amount);
    public void shareFeedback();
}

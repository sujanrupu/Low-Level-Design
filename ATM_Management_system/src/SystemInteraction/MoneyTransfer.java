package SystemInteraction;

public interface MoneyTransfer {
    public void receiverId(int id);
    public void validateReceiverId();
    public void setSendingAmount(int amount);
    public void sendConfirmation();
}

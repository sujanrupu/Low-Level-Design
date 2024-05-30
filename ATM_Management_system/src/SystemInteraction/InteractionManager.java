package SystemInteraction;

public class InteractionManager implements BalanceInquiry, PaymentWithdrawal, MoneyTransfer {
    @Override
    public void checkBalance() {
        System.out.println("Balance inquiry sent to bank.. wait a few minutes..");
    }

    @Override
    public void validateInfo() {
        System.out.println("Account information validated");
    }

    @Override
    public void showBalance(int amount) {
        System.out.println("Currently you have Rs.: " + amount + " in you account");
    }

    @Override
    public void checkWithDrawl(int amount) {
        System.out.println("Withdrawal of amount " + amount + " is possible");
    }

    @Override
    public void updateWithDrawl(int amount) {
        System.out.println("Withdrawal of amount : " + amount + " updated in database");
    }

    @Override
    public void receiverId(int id) {
        System.out.println("Sender ID inserted: " + id);
    }

    @Override
    public void validateReceiverId() {
        System.out.println("Receiver information validated");
    }

    @Override
    public void setSendingAmount(int amount) {
        System.out.println("Amount " + amount + " will be sent");
    }

    @Override
    public void sendConfirmation() {
        System.out.println("Amount sent successfully");
    }
}

public class RoomCancellation extends RoomBooking{
    public void cancellationApproval() {
        System.out.println("Cancellation request approved");
    }
    public void makeFine(int amount) {
        System.out.println("Penalty of Rs.: " + amount + " applied");
    }
    public void cancelRefund(int amount) {
        System.out.println("Amount Rs.: " + amount + " refunded");
    }
}

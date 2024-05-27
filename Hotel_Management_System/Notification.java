public class Notification {
    public void sendNotification(String time, int guestId) {
        System.out.println("Notification sent to " + guestId + ", at " + time);
    }
    public void recordNotification() {
        System.out.println("Notification status recorded");
    }
    public void makeRepeatation(int number) {
        if(number == 0)
            System.out.println("Notification will not be sent again");
        else
            System.out.println("Notification will be sent more " + number + " times");
    }
}

package Account;

public class AccountManager implements HouseKeeper, Server, Guest, Receptionist{
    @Override
    public void setHouseKeeperRole() {
        System.out.println("Housekeeping account created and role assigned");
    }

    @Override
    public void accessHouseKeepingTasks() {
        System.out.println("Housekeeping task accessed and checked");
    }

    @Override
    public void checkHouseKeepingRoom(int number) {
        System.out.println("House keeping allocated for room number: " + number);
    }

    @Override
    public void updateHouseKeepingTasksStatus() {
        System.out.println("House keeping status updated");
    }


    @Override
    public void setServerRole() {
        System.out.println("Server account created and role assigned");
    }

    @Override
    public void checkAssignedTasks() {
        System.out.println("Service task accessed and checked");
    }

    @Override
    public void checkServiceRoom(int number) {
        System.out.println("Room service allocated for room number: " + number);
    }

    @Override
    public void updateTaskStatus() {
        System.out.println("Service status updated");
    }


    @Override
    public void checkAvailability(String date, String roomType) {
        System.out.println(roomType + " room available on: " + date);
    }

    @Override
    public void bookRoom() {
        System.out.println("Room booked");
    }

    @Override
    public void idVerification(int aadhar) {
        System.out.println(aadhar + " verified");
    }

    @Override
    public void payment(int amount) {
        System.out.println("Please pay amount : " + amount);
    }

    @Override
    public void paymentConfirmation(int amount) {
        System.out.println("Rs. " + amount + " paid successfully");
    }

    @Override
    public void shareFeedback() {
        System.out.println("Feedback shared");
    }


    @Override
    public void setReceptionistRole() {
        System.out.println("Receptionist account created and role assigned");
    }

    @Override
    public void checkGuestData() {
        System.out.println("Guest data checked successfully");
    }

    @Override
    public void manageGuestInformation() {
        System.out.println("Guest data stored in database");
    }

    @Override
    public void paymentValidation(int amount) {
        System.out.println(amount + " received successfully");
    }

    @Override
    public void allocateGuestRoom(int number) {
        System.out.println("Room no.: " + number + " allocated");
    }

    @Override
    public void resolveGuestIssue() {
        System.out.println("Guest issue resolved and updated");
    }
}

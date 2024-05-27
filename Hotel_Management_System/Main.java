import Account.AccountManager;
import Room.RoomManager;

public class Main {

    public static void main(String[] args) {
        // Create instances of necessary classes
        AccountManager accountManager = new AccountManager();
        RoomManager roomManager = new RoomManager();
        HouseKeeping houseKeeping = new HouseKeeping();
        Notification notification = new Notification();
        RoomBooking roomBooking = new RoomBooking();
        RoomCancellation roomCancellation = new RoomCancellation();
        RoomKey roomKey = new RoomKey();
        Manager manager = new Manager();

        // Demonstrate functionalities from each class
        accountManager.setHouseKeeperRole();
        accountManager.setServerRole();
        accountManager.setReceptionistRole();
        accountManager.checkAvailability("2024-05-27", "Standard");

        roomManager.setStandard();
        roomManager.standardPrice(100);
        roomManager.setDeluxe();
        roomManager.deluxePrice(200);

        houseKeeping.houseKeepingRoom(101, "10:00");
        houseKeeping.makeAdditionalCharge(0);
        houseKeeping.assignHouseKeepingStaff(123);
        houseKeeping.updateRecord();

        notification.sendNotification("12:00", 456);
        notification.recordNotification();
        notification.makeRepeatation(3);

        roomBooking.confirmation();
        roomBooking.allocateRoomKey(1234);

        roomCancellation.cancellationApproval();
        roomCancellation.makeFine(50);
        roomCancellation.cancelRefund(100);

        roomKey.assignStandardRoomKey("ST123");
        roomKey.assignDeluxeRoomKey("DX456");

        manager.manageModule();
        manager.manageGuestFeedback();
    }
}

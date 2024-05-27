import Account.AccountManager;

public class RoomBooking extends AccountManager {
    public void confirmation() {
        System.out.println("Conformation sent");
    }
    public void allocateRoomKey(int key) {
        System.out.println("Room key: " + key + " allocated");
    }
}

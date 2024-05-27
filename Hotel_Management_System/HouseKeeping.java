public class HouseKeeping {
    public void houseKeepingRoom(int roomNumber, String time) {
        System.out.println("House keeping booked from room no.: " + roomNumber + " at: " + time);
    }
    public void makeAdditionalCharge(int amount) {
        if(amount == 0)
            System.out.println("You do not have to apy any additional amount");
        else
            System.out.println("Ypu have to pay additional amount of Rs.: " + amount);
    }
    public void assignHouseKeepingStaff(int staffId) {
        System.out.println("House keeping staff with ID: " + staffId + " assigned to you");
    }
    public void updateRecord() {
        System.out.println("House keeping record updated");
    }
}

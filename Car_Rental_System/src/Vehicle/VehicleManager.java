package Vehicle;

public class VehicleManager implements Car, Van, Motorcycle, Truck{
    public void economy() {
        System.out.println("Economy car booked");
    }
    public void luxury() {
        System.out.println("Luxury car booked");
    }
    public void standard() {
        System.out.println("Standard car booked");
    }
    public void comfort() {
        System.out.println("Comfort car booked");
    }

    public void passenger() {
        System.out.println("Passenger van booked");
    }
    public void cargo() {
        System.out.println("Cargo van booked");
    }

    public void cruiser() {
        System.out.println("Cruiser motorcycle booked");
    }
    public void touring() {
        System.out.println("Cruiser touring booked");
    }
    public void sports() {
        System.out.println("Sports motorcycle booked");
    }

    public void light() {
        System.out.println("Light truck booked");
    }
    public void medium() {
        System.out.println("Medium truck booked");
    }
    public void highDuty() {
        System.out.println("High-duty truck booked");
    }
}

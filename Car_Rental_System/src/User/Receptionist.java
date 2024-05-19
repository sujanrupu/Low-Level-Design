package User;

public class Receptionist {
    public void takeCharge() {
        System.out.println("Car -> 100/Day, Van -> 200/Day, MotorCycle -> 300/Day, Truck -> 400/Day");
    }
    public void takeCarCharge(int n) {
        System.out.println("Charge collected: Rs.: " + (100 * n));
    }
    public void takeVanCharge(int n) {
        System.out.println("Charge collected: Rs.: " + (200 * n));
    }
    public void takeMotorCycleCharge(int n) {
        System.out.println("Charge collected: Rs.: " + (300 * n));
    }
    public void takeTruckCharge(int n) {
        System.out.println("Charge collected: Rs.: " + (400 * n));
    }
}

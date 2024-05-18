public class Payment {
    public void carPayment(int duration) {
        System.out.println("Fees collected: Rs.: " + (200 * duration));
    }
    public void motorCyclePayment(int duration) {
        System.out.println("Fees collected: Rs.: " + (150 * duration));
    }

    public void truckPayment(int duration) {
        System.out.println("Fees collected: Rs.: " + (250 * duration));
    }

    public void vanPayment(int duration) {
        System.out.println("Fees collected: Rs.: " + (100 * duration));
    }
}

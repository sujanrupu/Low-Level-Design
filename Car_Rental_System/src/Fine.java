public class Fine{
    public void showFine() {
        System.out.println("Fine: ");
        System.out.println("Car -> 100/Day, Van -> 200/Day, Motorcycle -> 300/Day, Truck -> 400/Day");
    }
    public void calculateCarFine(int day) {
        System.out.println("Total fine amount : Rs.: " + (100*day));
    }
    public void calculateVanFine(int day) {
        System.out.println("Total fine amount : Rs.: " + (200*day));
    }
    public void calculateMotorcycleFine(int day) {
        System.out.println("Total fine amount : Rs.: " + (300*day));
    }
    public void calculateTruckFine(int day) {
        System.out.println("Total fine amount : Rs.: " + (400*day));
    }
}

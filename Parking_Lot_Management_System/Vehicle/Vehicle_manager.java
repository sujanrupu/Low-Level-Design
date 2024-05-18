package Vehicle;

public class Vehicle_manager implements Car, Truck, Motorcycle, Van{
    int ind = 0;
    @Override
    public void carFee() {
        System.out.println("Car fee -> Rs.: 200/Hr.");
    }

    @Override
    public void generateCarInd() {
        ind += 1;
        System.out.println("Your car ID: " + ind);
    }

    @Override
    public void vanFee() {
        System.out.println("Van fee -> Rs.: 100/Hr.");
    }

    @Override
    public void generateVanInd() {
        ind += 1;
        System.out.println("Your van ID: " + ind);
    }

    @Override
    public void motorcycleFee() {
        System.out.println("Motorcycle fee -> Rs.: 150/Hr.");
    }

    @Override
    public void generateMotorCycleInd() {
        ind += 1;
        System.out.println("Your motor cycle ID: " + ind);
    }

    @Override
    public void truckFee() {
        System.out.println("Truck fee -> Rs.: 250/Hr.");
    }

    @Override
    public void generateTruckInd() {
        ind += 1;
        System.out.println("Your truck ID: " + ind);
    }
}

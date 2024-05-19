package Indexing;

public class IndexingManager implements carIndexing, vanIndexing, motorCycleIndexing, truckIndexing{
    int carCount = 0, vanCount = 0, cycleCount = 0, truckCount = 0;
    public void canIndexing() {
        if(carCount >= 4) System.out.println("Can not rent no more car");
        else {
            if(carCount == 0) {
                System.out.println("Car ID: C1");
                carCount++;
            }
            else if(carCount == 1)  {
                System.out.println("Car ID: C2");
                carCount++;
            }
            else if(carCount == 2)  {
                System.out.println("Car ID: C3");
                carCount++;
            }
            else{
                System.out.println("Car ID: C4");
                carCount++;
            }
        }
    }

    public void vanIndexing() {
        if(vanCount >=2) System.out.println("Can not rent no more van");
        else {
            if(vanCount == 0) {
                System.out.println("Van ID: V1");
                vanCount++;
            }
            else {
                System.out.println("Van ID: V2");
                vanCount++;
            }
        }
    }

    public void motorCycleIndexing() {
        if(cycleCount >= 3) System.out.println("Can not rent no more motor cycle");
        else {
            if(cycleCount == 0) {
                System.out.println("Motor cycle ID: M1");
                cycleCount++;
            }
            else if(cycleCount == 1)  {
                System.out.println("Motor cycle ID: M2");
                cycleCount++;
            }
            else {
                System.out.println("Motor cycle ID: M3");
                cycleCount++;
            }
        }
    }

    public void truckIndexing() {
        if(truckCount >= 3) System.out.println("Can not rent no more truck");
        else {
            if(truckCount == 0) {
                System.out.println("Truck ID: T1");
                truckCount++;
            }
            else if(truckCount == 1)  {
                System.out.println("Truck ID: T2");
                truckCount++;
            }
            else {
                System.out.println("Truck ID: T3");
                truckCount++;
            }
        }
    }
}

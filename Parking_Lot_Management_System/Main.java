import Parking_Spot.SpotManager;
import Vehicle.Vehicle_manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle_manager vm = new Vehicle_manager();
        SpotManager sm = new SpotManager();
        Capacity cp = new Capacity();
        Payment pm = new Payment();

        while(true) {
            if(cp.isVacant()) {
                System.out.println("Enter 1 -> Car, 2 -> Truck, 3 -> Van, 4 -> MotorCycle");
                int n = sc.nextInt();
                if(n == 1) {
                    System.out.println("Enter 1 -> Handicapped, 2 -> Compact, 3 -> Large, 4 -> Motorcycle");
                    int m = sc.nextInt();
                    if(m == 1) {
                        if(sm.checkhandicappedAllocation()) {
                            cp.fillCapacity();
                            vm.carFee();
                            vm.generateCarInd();
                            sm.handicappedAllocation();
                            sm.handicappedSlotId();
                            System.out.println("Parking duration (int Hr.): ");
                            int hr = sc.nextInt();
                            pm.carPayment(hr);
                        }
                    }
                    else if(m == 2) {
                        if(sm.checkcompactAllocation()) {
                            cp.fillCapacity();
                            vm.carFee();
                            vm.generateCarInd();
                            sm.compactAllocation();
                            sm.compactSlotId();
                            System.out.println("Parking duration (int Hr.): ");
                            int hr = sc.nextInt();
                            pm.carPayment(hr);
                        }
                    }
                    else if(m == 3) {
                        if(sm.checklargeAllocation()) {
                            cp.fillCapacity();
                            vm.carFee();
                            vm.generateCarInd();
                            sm.largeAllocation();
                            sm.largeSlotId();
                            System.out.println("Parking duration (int Hr.): ");
                            int hr = sc.nextInt();
                            pm.carPayment(hr);
                        }
                    }
                    else {
                        if(sm.checkmotorcycleAllocation()) {
                            cp.fillCapacity();
                            vm.carFee();
                            vm.generateCarInd();
                            sm.motorcycleAllocation();
                            sm.motorcycleSlotId();
                            System.out.println("Parking duration (int Hr.): ");
                            int hr = sc.nextInt();
                            pm.carPayment(hr);
                        }
                    }
                }

                else if(n == 2) {
                    System.out.println("Enter 1 -> Handicapped, 2 -> Compact, 3 -> Large, 4 -> Motorcycle");
                    int m = sc.nextInt();
                    if(m == 1) {
                        if(sm.checkhandicappedAllocation()) {
                            cp.fillCapacity();
                            vm.truckFee();
                            vm.generateTruckInd();
                            sm.handicappedAllocation();
                            sm.handicappedSlotId();
                            System.out.println("Parking duration (int Hr.): ");
                            int hr = sc.nextInt();
                            pm.truckPayment(hr);
                        }
                    }
                    else if(m == 2) {
                        if(sm.checkcompactAllocation()) {
                            cp.fillCapacity();
                            vm.truckFee();
                            vm.generateTruckInd();
                            sm.compactAllocation();
                            sm.compactSlotId();
                            System.out.println("Parking duration (int Hr.): ");
                            int hr = sc.nextInt();
                            pm.truckPayment(hr);
                        }
                    }
                    else if(m == 3) {
                        if(sm.checklargeAllocation()) {
                            cp.fillCapacity();
                            vm.truckFee();
                            vm.generateTruckInd();
                            sm.largeAllocation();
                            sm.largeSlotId();
                            System.out.println("Parking duration (int Hr.): ");
                            int hr = sc.nextInt();
                            pm.truckPayment(hr);
                        }
                    }
                    else {
                        if(sm.checkmotorcycleAllocation()) {
                            cp.fillCapacity();
                            vm.truckFee();
                            vm.generateTruckInd();
                            sm.motorcycleAllocation();
                            sm.motorcycleSlotId();
                            System.out.println("Parking duration (int Hr.): ");
                            int hr = sc.nextInt();
                            pm.truckPayment(hr);
                        }
                    }
                }

                else if(n == 3) {
                    System.out.println("Enter 1 -> Handicapped, 2 -> Compact, 3 -> Large, 4 -> Motorcycle");
                    int m = sc.nextInt();
                    if(m == 1) {
                        if(sm.checkhandicappedAllocation()) {
                            cp.fillCapacity();
                            vm.vanFee();
                            vm.generateVanInd();
                            sm.handicappedAllocation();
                            sm.handicappedSlotId();
                            System.out.println("Parking duration (int Hr.): ");
                            int hr = sc.nextInt();
                            pm.vanPayment(hr);
                        }
                    }
                    else if(m == 2) {
                        if(sm.checkcompactAllocation()) {
                            cp.fillCapacity();
                            vm.vanFee();
                            vm.generateVanInd();
                            sm.compactAllocation();
                            sm.compactSlotId();
                            System.out.println("Parking duration (int Hr.): ");
                            int hr = sc.nextInt();
                            pm.vanPayment(hr);
                        }
                    }
                    else if(m == 3) {
                        if(sm.checklargeAllocation()) {
                            cp.fillCapacity();
                            vm.vanFee();
                            vm.generateVanInd();
                            sm.largeAllocation();
                            sm.largeSlotId();
                            System.out.println("Parking duration (int Hr.): ");
                            int hr = sc.nextInt();
                            pm.vanPayment(hr);
                        }
                    }
                    else {
                        if(sm.checkmotorcycleAllocation()) {
                            cp.fillCapacity();
                            vm.vanFee();
                            vm.generateVanInd();
                            sm.motorcycleAllocation();
                            sm.motorcycleSlotId();
                            System.out.println("Parking duration (int Hr.): ");
                            int hr = sc.nextInt();
                            pm.vanPayment(hr);
                        }
                    }
                }

                else if(n == 4) {
                    System.out.println("Enter 1 -> Handicapped, 2 -> Compact, 3 -> Large, 4 -> Motorcycle");
                    int m = sc.nextInt();
                    if(m == 1) {
                        if(sm.checkhandicappedAllocation()) {
                            cp.fillCapacity();
                            vm.motorcycleFee();
                            vm.generateMotorCycleInd();
                            sm.handicappedAllocation();
                            sm.handicappedSlotId();
                            System.out.println("Parking duration (int Hr.): ");
                            int hr = sc.nextInt();
                            pm.motorCyclePayment(hr);
                        }
                    }
                    else if(m == 2) {
                        if(sm.checkcompactAllocation()) {
                            cp.fillCapacity();
                            vm.motorcycleFee();
                            vm.generateMotorCycleInd();
                            sm.compactAllocation();
                            sm.compactSlotId();
                            System.out.println("Parking duration (int Hr.): ");
                            int hr = sc.nextInt();
                            pm.motorCyclePayment(hr);
                        }
                    }
                    else if(m == 3) {
                        if(sm.checklargeAllocation()) {
                            cp.fillCapacity();
                            vm.motorcycleFee();
                            vm.generateMotorCycleInd();
                            sm.largeAllocation();
                            sm.largeSlotId();
                            System.out.println("Parking duration (int Hr.): ");
                            int hr = sc.nextInt();
                            pm.motorCyclePayment(hr);
                        }
                    }
                    else {
                        if(sm.checkmotorcycleAllocation()) {
                            cp.fillCapacity();
                            vm.motorcycleFee();
                            vm.generateMotorCycleInd();
                            sm.motorcycleAllocation();
                            sm.motorcycleSlotId();
                            System.out.println("Parking duration (int Hr.): ");
                            int hr = sc.nextInt();
                            pm.motorCyclePayment(hr);
                        }
                    }
                }
                else {
                    break;
                }
            }
            else {
                System.out.println("Can not park no more car, parking full");
                break;
            }

        }

    }
}
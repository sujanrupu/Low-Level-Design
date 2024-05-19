import Indexing.IndexingManager;
import User.Customer;
import User.Receptionist;
import Vehicle.VehicleManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Customer cst = new Customer();
        Receptionist rpt = new Receptionist();
        IndexingManager im = new IndexingManager();
        VehicleManager vm = new VehicleManager();
        Fine fn = new Fine();
        RentalTracking rt = new RentalTracking();

        while(true) {
            cst.askCustomer();
            rpt.takeCharge();
            int n = sc.nextInt();
            System.out.println("How many days you want to rent: ");
            int days = sc.nextInt();
            if(n == 1) {
                System.out.println("Enter 1 -> Economy, 2 -> Luxury, 3 -> Standard, 4 -> Comfort");
                int carType = sc.nextInt();
                if(carType == 1)    vm.economy();
                else if(carType == 2)   vm.luxury();
                else if(carType == 3)   vm.standard();
                else vm.comfort();
                im.canIndexing();
                System.out.println("How many days you rented the car: ");
                int rentDuration = sc.nextInt();
                rpt.takeCarCharge(days);
                if(rentDuration > days) fn.calculateCarFine(rentDuration -days);
            }

            else if(n == 2) {
                System.out.println("Enter 1 -> Passenger, 2 -> Cargo");
                int vanType = sc.nextInt();
                if(vanType == 1)    vm.passenger();
                else vm.cargo();
                im.vanIndexing();
                System.out.println("How many days you rented the van: ");
                int rentDuration = sc.nextInt();
                rpt.takeVanCharge(days);
                if(rentDuration > days) fn.calculateVanFine(rentDuration -days);
            }

            else if(n == 3) {
                System.out.println("Enter 1 -> Cruiser, 2 -> Touring, 3 -> Sports");
                int cycleType = sc.nextInt();
                if(cycleType == 1)    vm.cruiser();
                else if(cycleType == 2) vm.touring();
                else vm.sports();
                im.motorCycleIndexing();
                System.out.println("How many days you rented the motor cycle: ");
                int rentDuration = sc.nextInt();
                rpt.takeMotorCycleCharge(days);
                if(rentDuration > days) fn.calculateMotorcycleFine(rentDuration -days);
            }

            else if(n == 4){
                System.out.println("Enter 1 -> Light, 2 -> Medium, 3 -> High-duty");
                int truckType = sc.nextInt();
                if(truckType == 1)    vm.light();
                else if(truckType == 2) vm.medium();
                else vm.highDuty();
                im.truckIndexing();
                System.out.println("How many days you rented the truck: ");
                int rentDuration = sc.nextInt();
                rpt.takeTruckCharge(days);
                if(rentDuration > days) fn.calculateTruckFine(rentDuration -days);
            }

            else {
                break;
            }
        }



    }
}
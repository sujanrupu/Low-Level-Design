package Parking_Spot;

public class SpotManager implements Handicapped, Compact, Large, Motorcycle{
    int hid = 0, lid = 0, cid = 0, mid = 0;

    public boolean checkhandicappedAllocation() {
        if(hid >= 2) {
            System.out.println("This type of lot is no longer available");
            return false;
        }
        return true;
    }
    public void handicappedAllocation() {
        System.out.println("Handicapped slot allocated");
    }
    public void handicappedSlotId() {
        if(hid == 0) {
            System.out.println("Parking ID: H1");
            hid++;
        }
        else if(hid == 1) {
            System.out.println("Parking ID: H2");
            hid++;
        }
    }

    public boolean checklargeAllocation() {
        if(lid >= 2) {
            System.out.println("This type of lot is no longer available");
            return false;
        }
        return true;
    }
    public void largeAllocation() {
        System.out.println("Large slot allocated");
    }
    public void largeSlotId() {
        if(lid == 0) {
            System.out.println("Parking ID: L1");
            lid++;
        }
        else if(lid == 1) {
            System.out.println("Parking ID: L2");
            lid++;
        }
    }

    public boolean checkcompactAllocation() {
        if(cid >= 2) {
            System.out.println("This type of lot is no longer available");
            return false;
        }
        return true;
    }
    public void compactAllocation() {
        System.out.println("Compact slot allocated");
    }
    public void compactSlotId() {
        if(cid == 0) {
            System.out.println("Parking ID: C1");
            cid++;
        }
        else if(cid == 1) {
            System.out.println("Parking ID: C2");
            cid++;
        }
    }

    public boolean checkmotorcycleAllocation() {
        if(mid >= 2) {
            System.out.println("This type of lot is no longer available");
            return false;
        }
        return true;
    }
    public void motorcycleAllocation() {
        System.out.println("Motor cycle slot allocated");
    }
    public void motorcycleSlotId() {
        if(mid == 0) {
            System.out.println("Parking ID: M1");
            cid++;
        }
        else if(mid == 1) {
            System.out.println("Parking ID: M2");
            mid++;
        }
    }
}

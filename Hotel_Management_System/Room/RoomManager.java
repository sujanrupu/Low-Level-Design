package Room;

public class RoomManager implements Standard, Deluxe, FamilySuite, BusinessSuite{
    @Override
    public void setStandard() {
        System.out.println("Standard room assigned");
    }

    @Override
    public void standardPrice(int price) {
        System.out.println("Charge per night: Rs.: " + price);
    }

    @Override
    public void standardAdvantages() {
        System.out.println("Standard room advantages demonstrated");
    }

    @Override
    public void standardCapacity() {
        System.out.println("Max accommodation: 2 person(s)");
    }


    @Override
    public void setDeluxe() {
        System.out.println("Deluxe room assigned");
    }

    @Override
    public void deluxePrice(int price) {
        System.out.println("Charge per night: Rs.: " + price);
    }

    @Override
    public void deluxeAdvantages() {
        System.out.println("Deluxe room advantages demonstrated");
    }

    @Override
    public void deluxeCapacity() {
        System.out.println("Max accommodation: 3 person(s)");
    }


    @Override
    public void setFamilySuite() {
        System.out.println("Family suite room assigned");
    }

    @Override
    public void familySuitePrice(int price) {
        System.out.println("Charge per night: Rs.: " + price);
    }

    @Override
    public void familySuiteAdvantages() {
        System.out.println("Family suite room advantages demonstrated");
    }

    @Override
    public void familySuiteCapacity() {
        System.out.println("Max accommodation: 4 person(s)");
    }


    @Override
    public void setBusinessSuite() {
        System.out.println("Business suite room assigned");
    }

    @Override
    public void businessSuitePrice(int price) {
        System.out.println("Charge per night: Rs.: " + price);
    }

    @Override
    public void businessSuiteAdvantages() {
        System.out.println("Business suite room advantages demonstrated");
    }

    @Override
    public void businessSuiteCapacity() {
        System.out.println("Max accommodation: 4 person(s)");
    }
}

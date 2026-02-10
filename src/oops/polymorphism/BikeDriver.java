package oops.polymorphism;

public class BikeDriver extends Driver {

    public BikeDriver(String driverName, String licenseNumber) {
        super(driverName, licenseNumber);
    }

    @Override
    void drive() {
        super.drive();
        System.out.println("remove stands");
        System.out.println("change gear");
        System.out.println("Driving Bike..");
    }

    @Override
    void salary() {
        System.out.println("Bike Driver Salary: 15000");
    }

    void wearHelmet() {
        System.out.println("Wearing helmet...");
    }

}

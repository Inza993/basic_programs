package oops.polymorphism;

public class CarDriver extends Driver{
    public CarDriver(String driverName, String licenseNumber) {
        super(driverName, licenseNumber);
    }

    @Override
    void drive() {
        super.drive();
        System.out.println("remove hand brake");
        System.out.println("change gear");
        System.out.println("Driving Car..");
    }

    @Override
    void salary() {
        System.out.println("Car Driver Salary: 25000");
    }

    void wearSeatBelt() {
        System.out.println("Wearing seat belts");
    }

}

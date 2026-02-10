package oops.polymorphism;

public class Driver {
    String driverName;
    String licenseNumber;

    public Driver(String driverName, String licenseNumber) {
        this.driverName = driverName;
        this.licenseNumber = licenseNumber;
    }

    void drive() {
        System.out.println("Starting Vehicle");
    }

    void salary() {
        System.out.println("Base Salary: 5000");
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverName='" + driverName + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                '}';
    }
}

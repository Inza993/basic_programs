package oops.inheritance.constructor_chaining;

public class Vehicle {

    String name = "Vehicle";

    Vehicle() {
        System.out.println("Vehicle");
    }

    Vehicle(String name) {
        this.name = name;
    }

}

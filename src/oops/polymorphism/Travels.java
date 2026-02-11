package oops.polymorphism;

public class Travels {

    public static void main(String[] args) {
        CarDriver carDriver1 = new CarDriver("ola driver", "TN-1234567");
        BikeDriver bikeDriver1 = new BikeDriver("rapido driver", "TN-9876543");

        System.out.println(carDriver1);
        System.out.println(bikeDriver1);

        carDriver1.drive();
        bikeDriver1.drive();

        CarDriver carDriver2 = new CarDriver("uber driver", "TN-3245654");
        BikeDriver bikeDriver2 = new BikeDriver("uber driver", "TN-3446453");

        carDriver1.salary();
        carDriver2.salary();
        bikeDriver1.salary();
        bikeDriver2.salary();

        /*
         *  Driver, BikeDrive, CarDriver
         *  Need to put salary for drivers
         *  instead saying like put salary for BikeDriver and CarDriver we can say put salary for Driver
         *  because putting salary is common for all Driver objects
         * */

        /*
         *  if we are accessing methods that doesn't exist in a parent type
         *  don't need to use polymorphism e.g. bike's wearHelmet()
         * */

        // Driver and driver's subclasses
        System.out.println("put salaries");
        putSalary(carDriver1);
        putSalary(bikeDriver1);
        Driver carDriver3 = new CarDriver("uber driver2", "TN234532");
        carDriver3.salary();

        int[] arr = new int[4]; // 0 0 0 0
        int[] arr1 = {1, 2, 3, 4};

        // Dynamic binding
        System.out.println("Using list to call salary()");
        Driver[] drivers = {carDriver1, carDriver2, carDriver3, bikeDriver1, bikeDriver2};
        for (int i=0; i < drivers.length; i++) {
            drivers[i].salary();
        }

        putSalaries(drivers);
    }

    private static void putSalary(Driver driver) {
        driver.salary();
    }

    private static void putSalaries(Driver[] drivers) {
        for (int i=0; i < drivers.length; i++) {
            drivers[i].salary();
        }
    }


}

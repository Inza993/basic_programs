package oops.inheritance.constructor_chaining;

public class VehicleRunner {

    public static void main(String[] args) {
        Cycle bicycle = new Cycle(3);

        System.out.println(bicycle.name);
        System.out.println(bicycle.noOfTyres);

        Cycle tricycle = new Cycle(3, "Tricycle");
        System.out.println(tricycle.noOfTyres);
        System.out.println(tricycle.name);

        Cycle cycle = new Cycle();

        Object object = new Object();

        System.out.println(cycle); // oops.inheritance.constructor_chaining.Cycle@e9e54c2

        Cycle cycle1 = cycle;
        System.out.println(cycle1); // oops.inheritance.constructor_chaining.Cycle@e9e54c2

        System.out.println(cycle1 == cycle);

    }

}

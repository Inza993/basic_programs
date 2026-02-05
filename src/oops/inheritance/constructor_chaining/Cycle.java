package oops.inheritance.constructor_chaining;

public class Cycle extends Vehicle {

    int noOfTyres;

    // super() call
    Cycle() {
        System.out.println("Cycle");
    }

    // super() call
    Cycle(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    // no super() call
    Cycle(int noOfTyres, String name) {
//        super(name);
        this.noOfTyres = noOfTyres;
    }

}

package oops.interfaceprograms;

public class F1Car implements Car {
    @Override
    public void engine() {
        System.out.println("F1Car Engine");
    }

    @Override
    public int getSeats() {
        return seats;
    }
}

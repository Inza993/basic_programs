package oops.interfaceprograms;

public class SportsCar implements Car {

    @Override
    public void engine() {
        System.out.println("SportsCar Engine...");
    }

    @Override
    public int getSeats() {
//        seats = 10;
        return seats;
    }
}

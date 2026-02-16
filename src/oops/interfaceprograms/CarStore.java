package oops.interfaceprograms;

public class CarStore {

    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.engine();
        System.out.println(sportsCar.getSeats());

        Car f1Car = new F1Car();
        f1Car.engine();
        System.out.println(f1Car.getSeats());
        System.out.println(Car.seats);

//        Car car = new Car();
//        car.engine();

    }

    void displayCar(Car car) {

    }
}

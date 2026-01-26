public class CarClass {

    /*
    *  fields -> properties
    *  methods, functions, actions -> behaviours
    *  data -> fields
    *  data change, update, calculation -> methods
    * */

    /*
    *  int -> data type given by java
    *  actions -> arithmetic operations
    *
    *  class is used for creating a datatype with possible actions
    * */

    int price = 500000;
    String name = "Hundai";
    String model = "i10";

    void setPrice() {
        price = 1000000;
//        price.square();
    }

    void carDetails() {
        System.out.println(name.toUpperCase());
        System.out.println(model.toLowerCase());
        System.out.println(price);
    }

    /*
    *  void -> return datatype (int, float, String, CarClass)
    *  carDetails -> method name
    *  () -> parameters specification for inputs
    *  {} -> method body
    * */

    public static void main(String[] args) {
        String car = "car"; // literal creation
        String car1 = new String("car"); // object creation
        int a = 10;

        CarClass hundai = new CarClass(); // class is a blueprint of an object
        hundai.carDetails();
        hundai.setPrice(); // changes value in that car object
        hundai.carDetails();

        System.out.println("Ford Details:");

        CarClass ford = new CarClass();
        ford.name = "Ford";
        ford.model = "figo";
        ford.price = 600000;

        ford.carDetails();
        ford.setPrice();
        ford.carDetails();
    }

    /* Program Execution
    *       - Compile -> bytecode
    *       - Run
    * */

}

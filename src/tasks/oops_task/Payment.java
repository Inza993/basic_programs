package tasks.oops_task;

public abstract class Payment {

    Product[] products;
    Customer customer;

    Order order;

    float amount = order.calculateTotal();

    abstract boolean pay(float amount);

}

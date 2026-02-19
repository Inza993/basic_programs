package tasks.oops_task;

public class Order {

    int orderId;
    Product[] products;
    Customer customer;

    public Order(int orderId, Customer customer, Product[] products) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
    }

    float calculateTotal()
    {
        float total = 0;
        for(int i = 0; i < products.length ; i++)
        {
             total = total + products[i].price;
        }
        return total;
    }
}

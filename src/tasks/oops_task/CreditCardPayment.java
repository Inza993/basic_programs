package tasks.oops_task;

public class CreditCardPayment extends Payment{

    String cardnumber;

    public CreditCardPayment(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    @Override
    boolean pay(float amount) {
       return true;
    }
}

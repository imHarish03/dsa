package dsa.pattern.structural.bridge.paymentsystem.type;

public class CreditCardPayment implements PaymentMethod{

    /**
     * @param amount
     */
    @Override
    public void pay(double amount) {
        System.out.println("Credit Card Payment: " + amount);
    }
}

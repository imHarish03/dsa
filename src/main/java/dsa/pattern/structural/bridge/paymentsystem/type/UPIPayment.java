package dsa.pattern.structural.bridge.paymentsystem.type;

public class UPIPayment implements PaymentMethod {
    /**
     * @param amount
     */
    @Override
    public void pay(double amount) {
        System.out.println("UPI Payment: " + amount);
    }
}

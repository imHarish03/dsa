package dsa.pattern.structural.adapter.payment2;

public class RazorPaymentProcessor implements PaymentProcessor {
    /**
     * @param amount
     */
    @Override
    public void pay(double amount) {
        System.out.println("Razor: " + amount);
    }
}

package dsa.pattern.behaviuoral.stratergy;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using Cash");
    }
}

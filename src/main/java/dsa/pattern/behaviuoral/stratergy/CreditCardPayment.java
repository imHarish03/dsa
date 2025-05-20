package dsa.pattern.behaviuoral.stratergy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using Credit Card");
    }
}

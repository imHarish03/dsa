package dsa.pattern.behaviuoral.stratergy.payment.mode;

import dsa.pattern.behaviuoral.stratergy.payment.PaymentStrategy;
import dsa.pattern.behaviuoral.stratergy.payment.details.PaymentDetails;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount, PaymentDetails paymentDetails) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

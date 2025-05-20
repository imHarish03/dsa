package dsa.pattern.behaviuoral.stratergy.payment.mode;

import dsa.pattern.behaviuoral.stratergy.payment.PaymentStrategy;
import dsa.pattern.behaviuoral.stratergy.payment.details.CreditCardDetails;
import dsa.pattern.behaviuoral.stratergy.payment.details.PaymentDetails;

public class CreditCardPayment implements PaymentStrategy <CreditCardDetails> {
    @Override
    public void pay(double amount, CreditCardDetails paymentDetails) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

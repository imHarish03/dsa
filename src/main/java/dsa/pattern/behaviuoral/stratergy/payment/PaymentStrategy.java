package dsa.pattern.behaviuoral.stratergy.payment;

import dsa.pattern.behaviuoral.stratergy.payment.details.PaymentDetails;

public interface PaymentStrategy {
    void pay(double amount, PaymentDetails paymentDetails);
}

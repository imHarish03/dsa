package dsa.pattern.behaviuoral.stratergy.payment;

import dsa.pattern.behaviuoral.stratergy.payment.details.PaymentDetails;

public interface PaymentStrategy<T extends PaymentDetails> {
    void pay(double amount, T paymentDetails);
}

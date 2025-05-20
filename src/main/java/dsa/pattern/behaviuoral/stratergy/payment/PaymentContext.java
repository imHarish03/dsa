package dsa.pattern.behaviuoral.stratergy.payment;

import dsa.pattern.behaviuoral.stratergy.payment.details.PaymentDetails;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount, PaymentDetails paymentDetails) {
        paymentStrategy.pay(amount,paymentDetails);
    }
}

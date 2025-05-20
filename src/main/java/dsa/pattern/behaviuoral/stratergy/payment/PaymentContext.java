package dsa.pattern.behaviuoral.stratergy.payment;

import dsa.pattern.behaviuoral.stratergy.payment.details.PaymentDetails;

public class PaymentContext<T extends  PaymentDetails> {
    private PaymentStrategy<T> paymentStrategy;

    public PaymentContext(PaymentStrategy<T> paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount, T paymentDetails) {
        paymentStrategy.pay(amount,paymentDetails);
    }
}

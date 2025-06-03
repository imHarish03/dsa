package dsa.pattern.exercise.food_delivery.payment;

public class PaymentContext {
    private PaymentProcessor processor;

    public PaymentContext(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void pay(double amount) {
        processor.doPay(amount);
    }
}

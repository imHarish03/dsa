package dsa.pattern.exercise.food_delivery.payment;

public class CardPayment implements PaymentProcessor {
    @Override
    public void doPay(double amount) {
        System.out.println("Paying using Card: " + amount);
    }
}

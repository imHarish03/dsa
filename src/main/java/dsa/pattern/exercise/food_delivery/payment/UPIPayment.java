package dsa.pattern.exercise.food_delivery.payment;

public class UPIPayment implements PaymentProcessor{
    @Override
    public void doPay(double amount) {
        System.out.println("Paying using UPI: " + amount);
    }
}

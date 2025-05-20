package dsa.pattern.behaviuoral.stratergy.payment.mode;

import dsa.pattern.behaviuoral.stratergy.payment.PaymentStrategy;
import dsa.pattern.behaviuoral.stratergy.payment.details.PaymentDetails;

public class UpiPayment implements PaymentStrategy {
    public void pay(double amount, PaymentDetails paymentDetails) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}
package dsa.pattern.behaviuoral.stratergy.payment.mode;

import dsa.pattern.behaviuoral.stratergy.payment.PaymentStrategy;
import dsa.pattern.behaviuoral.stratergy.payment.details.PaymentDetails;
import dsa.pattern.behaviuoral.stratergy.payment.details.UpiDetails;

public class UpiPayment implements PaymentStrategy<UpiDetails> {
    public void pay(double amount, UpiDetails paymentDetails) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}
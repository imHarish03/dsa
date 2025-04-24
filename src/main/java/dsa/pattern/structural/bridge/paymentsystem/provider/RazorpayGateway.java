package dsa.pattern.structural.bridge.paymentsystem.provider;

import dsa.pattern.structural.bridge.paymentsystem.type.PaymentMethod;

public class RazorpayGateway extends PaymentProvider {

    public RazorpayGateway(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Razorpay Payment: " + amount);
    }
}

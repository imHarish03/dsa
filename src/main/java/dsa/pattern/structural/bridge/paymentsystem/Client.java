package dsa.pattern.structural.bridge.paymentsystem;

import dsa.pattern.structural.bridge.paymentsystem.provider.PaymentProvider;
import dsa.pattern.structural.bridge.paymentsystem.provider.RazorpayGateway;
import dsa.pattern.structural.bridge.paymentsystem.type.UPIPayment;

public class Client {
    public static void main(String[] args) {
        PaymentProvider razorpay = new RazorpayGateway(new UPIPayment());
        razorpay.pay(100);
    }
}

package dsa.pattern.structural.bridge.paymentsystem.provider;

import dsa.pattern.structural.bridge.paymentsystem.type.PaymentMethod;

public abstract class PaymentProvider {
    private PaymentMethod paymentMethod;

    public PaymentProvider(PaymentMethod paymentMethod){
        this.paymentMethod=paymentMethod;
    }

    protected PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public abstract void pay(double amount);
}

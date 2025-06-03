package dsa.pattern.exercise.food_delivery.payment;

import dsa.pattern.exercise.food_delivery.PaymentMode;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentFactory {
    private static final Map<PaymentMode, Supplier<PaymentProcessor>> processorSuppliers = new HashMap<>();

    static {
        processorSuppliers.put(PaymentMode.CARD, CardPayment::new);
        processorSuppliers.put(PaymentMode.UPI, UPIPayment::new);
        processorSuppliers.put(PaymentMode.WALLET, WalletPayment::new);
    }

    public static PaymentProcessor getPaymentProcessor(PaymentMode paymentMode) {
        Supplier<PaymentProcessor> supplier = processorSuppliers.get(paymentMode);
        if (supplier != null) return supplier.get();
        throw new IllegalArgumentException("Unsupported Payment Mode");
    }
}


package dsa.pattern.exercise.food_delivery;

import dsa.pattern.exercise.food_delivery.payment.PaymentContext;
import dsa.pattern.exercise.food_delivery.payment.PaymentFactory;
import dsa.pattern.exercise.food_delivery.payment.PaymentProcessor;

import java.util.List;
import java.util.Optional;

public class PaymentOptionApp {
    public static void main(String[] args) {
        UserType userType = UserType.GUEST; // Let's say current user is PREMIUM

        System.out.println("Available payment methods for " + userType + ":");
        List<PaymentMode> availableModes = PaymentOptionRegistry.getPaymentModes(userType);
        for (PaymentMode mode : availableModes) {
            System.out.println("- " + mode);
        }

        //User chosen payment mode
        PaymentMode paymentMode = PaymentMode.CARD;
        Optional<PaymentMode> paymentModeOptional = availableModes.stream().filter(mode -> mode.equals(paymentMode)).findFirst();

        paymentModeOptional.ifPresentOrElse(mode -> {
            PaymentProcessor processor = PaymentFactory.getPaymentProcessor(mode);
            if (processor != null) {
                new PaymentContext(processor).pay(100.0);
            } else {
                System.out.println("No processor found for mode: " + mode);
            }
        }, () -> System.out.println("Payment mode not available for " + userType));


    }
}

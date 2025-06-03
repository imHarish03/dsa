package dsa.pattern.exercise.food_delivery;

import java.util.List;

public class PaymentOptionApp {
    public static void main(String[] args) {
        UserType userType = UserType.GUEST; // Let's say current user is PREMIUM

        System.out.println("Available payment methods for " + userType + ":");
        List<PaymentMode> availableModes = PaymentOptionRegistry.getPaymentModes(userType);
        for (PaymentMode mode : availableModes) {
            System.out.println("- " + mode);
        }
    }
}

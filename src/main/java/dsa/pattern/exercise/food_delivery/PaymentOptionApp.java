package dsa.pattern.exercise.food_delivery;

import dsa.pattern.exercise.food_delivery.discount.CouponDiscountDecorator;
import dsa.pattern.exercise.food_delivery.discount.Discount;
import dsa.pattern.exercise.food_delivery.discount.RegularDiscount;
import dsa.pattern.exercise.food_delivery.discount.SeasonalDiscountDecorator;
import dsa.pattern.exercise.food_delivery.payment.PaymentContext;
import dsa.pattern.exercise.food_delivery.payment.PaymentFactory;
import dsa.pattern.exercise.food_delivery.payment.PaymentProcessor;

import java.util.List;
import java.util.Optional;

public class PaymentOptionApp {
    public static void main(String[] args) {
        int amount =100;
        Discount discount = new RegularDiscount(); // base 10% off
        discount = new SeasonalDiscountDecorator(discount); // additional 5%
        discount = new CouponDiscountDecorator(discount); // ₹20 off

        double finalAmount = discount.apply(amount);
        System.out.println("Final Amount: ₹" + finalAmount);

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
                new PaymentContext(processor).pay(finalAmount);
            } else {
                System.out.println("No processor found for mode: " + mode);
            }
        }, () -> System.out.println("Payment mode not available for " + userType));


    }
}

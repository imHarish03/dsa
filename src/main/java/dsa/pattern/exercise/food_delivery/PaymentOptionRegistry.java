package dsa.pattern.exercise.food_delivery;

import java.util.*;

public class PaymentOptionRegistry {
    private static final Map<UserType, List<PaymentMode>> registry = new HashMap<>();

    static {
        registry.put(UserType.GUEST, Arrays.asList(PaymentMode.UPI));
        registry.put(UserType.REGISTERED, Arrays.asList(PaymentMode.UPI, PaymentMode.CARD));
        registry.put(UserType.PREMIUM, Arrays.asList(PaymentMode.UPI, PaymentMode.CARD, PaymentMode.WALLET, PaymentMode.NETBANKING));
    }

    public static List<PaymentMode> getPaymentModes(UserType userType) {
        return registry.getOrDefault(userType, Collections.emptyList());
    }
}

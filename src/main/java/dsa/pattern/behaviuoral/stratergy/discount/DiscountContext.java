package dsa.pattern.behaviuoral.stratergy.discount;

import java.util.HashMap;
import java.util.Map;

public class DiscountContext {
    public Map<String, DiscountProvider> discountProviders = new HashMap<>();

    public DiscountContext() {
        discountProviders.put("regular", new RegularCustomer());
        discountProviders.put("elite", new EliteCustomer());
        discountProviders.put("premium", new PremiumCustomer());
    }

    public double apply(String customerType, double totalAmount) {
        DiscountProvider provider = discountProviders.get(customerType.toLowerCase());
        if (provider == null) {
            throw new IllegalArgumentException("Unsupported customer type: " + customerType);
        }
        double discount = provider.getDiscount();
        return totalAmount - (totalAmount * discount / 100);
    }

}

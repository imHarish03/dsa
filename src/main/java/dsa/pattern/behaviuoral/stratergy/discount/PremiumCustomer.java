package dsa.pattern.behaviuoral.stratergy.discount;

public class PremiumCustomer implements DiscountProvider{
    @Override
    public double getDiscount() {
        return 10;
    }
}

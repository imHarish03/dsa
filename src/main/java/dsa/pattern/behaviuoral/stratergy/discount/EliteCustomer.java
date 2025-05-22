package dsa.pattern.behaviuoral.stratergy.discount;

public class EliteCustomer implements DiscountProvider {
    @Override
    public double getDiscount() {
        return 15.0;
    }
}

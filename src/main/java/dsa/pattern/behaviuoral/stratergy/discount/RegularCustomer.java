package dsa.pattern.behaviuoral.stratergy.discount;

public class RegularCustomer implements DiscountProvider{
    @Override
    public double getDiscount() {
        return 5.0;
    }
}

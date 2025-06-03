package dsa.pattern.exercise.food_delivery.discount;

public class CouponDiscountDecorator implements Discount {
    private Discount base;

    public CouponDiscountDecorator(Discount base) {
        this.base = base;
    }

    public double apply(double amount) {
        double discounted = base.apply(amount);
        return discounted - 20; // Flat ₹20 off
    }
}

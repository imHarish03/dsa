package dsa.pattern.exercise.food_delivery.discount;

public class SeasonalDiscountDecorator implements Discount {
    private Discount base;

    public SeasonalDiscountDecorator(Discount base) {
        this.base = base;
    }

    public double apply(double amount) {
        double discounted = base.apply(amount);
        return discounted * 0.95; // Additional 5% off
    }
}

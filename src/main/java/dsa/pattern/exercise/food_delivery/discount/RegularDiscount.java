package dsa.pattern.exercise.food_delivery.discount;

public class RegularDiscount implements Discount {
    public double apply(double amount) {
        return amount * 0.90; // 10% off
    }
}

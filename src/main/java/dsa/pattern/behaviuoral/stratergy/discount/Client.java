package dsa.pattern.behaviuoral.stratergy.discount;

public class Client {

    public static void main(String[] args) {
        DiscountContext discountContext = new DiscountContext();
        System.out.println(discountContext.apply("regular",1000.0));
    }
}

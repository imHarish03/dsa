package dsa.pattern.structural.adapter.payment2;

public class LegacyPayPalAPI {
    public void sendPayment(double amountInDollars) {
        System.out.println("Paid $" + amountInDollars + " via Legacy PayPal API");
    }
}

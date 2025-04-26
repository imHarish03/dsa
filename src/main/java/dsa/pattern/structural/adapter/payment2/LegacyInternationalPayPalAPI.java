package dsa.pattern.structural.adapter.payment2;

public class LegacyInternationalPayPalAPI {
    public void sendUSDPayment(double amountInUSD) {
        System.out.println("Paid $" + amountInUSD + " via PayPal (International)");
    }
}

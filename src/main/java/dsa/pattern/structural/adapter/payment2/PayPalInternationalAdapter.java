package dsa.pattern.structural.adapter.payment2;

public class PayPalInternationalAdapter implements PaymentProcessor {
    private LegacyInternationalPayPalAPI legacyAPI;
    private CurrencyConverter converter;

    public PayPalInternationalAdapter(LegacyInternationalPayPalAPI legacyAPI, CurrencyConverter converter) {
        this.legacyAPI = legacyAPI;
        this.converter = converter;
    }

    @Override
    public void pay(double amountInINR) {
        double amountInUSD = converter.convert("INR", "USD", amountInINR);
        legacyAPI.sendUSDPayment(amountInUSD);
    }
}

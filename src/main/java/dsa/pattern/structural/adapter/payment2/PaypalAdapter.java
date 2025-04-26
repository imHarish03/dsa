package dsa.pattern.structural.adapter.payment2;

public class PaypalAdapter implements PaymentProcessor{

    private  LegacyPayPalAPI legacyPayPalAPI;

    PaypalAdapter(LegacyPayPalAPI legacyPayPalAPI) {
        this.legacyPayPalAPI=legacyPayPalAPI;
    }

    @Override
    public void pay(double amount) {
        legacyPayPalAPI.sendPayment(amount);
    }
}

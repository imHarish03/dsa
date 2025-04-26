package dsa.pattern.structural.adapter.payment2;

public class PaypalAdapter implements PaymentProcessor{

    private  LegacyPayPalAPI legacyPayPalAPI;

    PaypalAdapter(LegacyPayPalAPI legacyPayPalAPI) {
        System.out.println("Adapter created");
        this.legacyPayPalAPI=legacyPayPalAPI;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment initated via adapter");
        legacyPayPalAPI.sendPayment(amount);
    }
}

package dsa.pattern.structural.adapter.payment;

public class CardToUPIPaymentAdapter implements CardPaymentGateway{

    private UPIPayment upiPayment;

    public CardToUPIPaymentAdapter(UPIPayment upiPayment) {
        this.upiPayment = upiPayment;
    }

    @Override
    public void processCardPayment(double amount) {
        upiPayment.pay(amount);
    }
}

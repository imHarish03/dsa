package dsa.pattern.structural.adapter.payment;

public class Client {
    public static void main(String[] args) {
        UPIPayment upiPayment = new UPIPaymentImpl() ;
        CardPaymentGateway cardPaymentGateway = new CardToUPIPaymentAdapter(upiPayment);
        cardPaymentGateway.processCardPayment(100.0);
    }
}

package dsa.pattern.behaviuoral.stratergy;

public class Client {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new CashPayment());
        paymentContext.pay(100.0);
    }
}

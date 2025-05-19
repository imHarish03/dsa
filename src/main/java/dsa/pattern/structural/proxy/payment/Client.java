package dsa.pattern.structural.proxy.payment;

public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new BankProxyPayment(new BankPaymentService());
        paymentService.transferAmount("A", "B", 100);
    }
}

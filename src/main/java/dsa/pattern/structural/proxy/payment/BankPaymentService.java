package dsa.pattern.structural.proxy.payment;

public class BankPaymentService implements PaymentService{
    @Override
    public void transferAmount(String from, String to, double amount) {
        System.out.println("Transfer amount " + amount + " from " + from + " to " + to);
    }
}

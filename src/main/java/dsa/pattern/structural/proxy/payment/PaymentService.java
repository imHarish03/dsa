package dsa.pattern.structural.proxy.payment;

public interface PaymentService {
    void transferAmount(String from, String to, double amount);
}

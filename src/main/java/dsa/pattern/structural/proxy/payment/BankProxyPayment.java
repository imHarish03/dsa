package dsa.pattern.structural.proxy.payment;

public class BankProxyPayment implements PaymentService {
    private final PaymentService realService;

    public BankProxyPayment(PaymentService realService) {
    this.realService=realService;
    }

    @Override
    public void transferAmount(String from, String to, double amount) {
        System.out.println("[LOG] Initiating transfer...");
        realService.transferAmount(from, to, amount);
        System.out.println("[LOG] Transfer complete.");
    }
}

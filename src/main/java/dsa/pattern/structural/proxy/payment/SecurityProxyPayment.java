package dsa.pattern.structural.proxy.payment;

public class SecurityProxyPayment {
    private PaymentService realService;

    public SecurityProxyPayment(PaymentService realService) {
        this.realService = realService;
    }


    public void transferAmount(String from, String to, double amount,String password) {

        if (!password.trim().equals("admin")) {
            System.out.println("[LOG] Security check failed.");
            return;
        }
        transferAmount(from, to, amount);
    }

    private void transferAmount(String from, String to, double amount) {
        if (from.equals("A") && to.equals("B") && amount > 1000) {
            System.out.println("[LOG] Security check failed.");
            return;
        }
        System.out.println("[LOG] Initiating transfer...");
        realService.transferAmount(from, to, amount);
        System.out.println("[LOG] Transfer complete.");
    }
}

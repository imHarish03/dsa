package dsa.pattern.structural.adapter.payment;

public class UPIPaymentImpl implements UPIPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

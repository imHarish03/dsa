package dsa.pattern.behaviuoral.stratergy.payment.details;

public class UpiDetails implements PaymentDetails {
    private String upiId;

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }
}
package dsa.pattern.behaviuoral.stratergy.payment;

import dsa.pattern.behaviuoral.stratergy.payment.details.CreditCardDetails;
import dsa.pattern.behaviuoral.stratergy.payment.details.PaymentDetails;
import dsa.pattern.behaviuoral.stratergy.payment.mode.CashPayment;
import dsa.pattern.behaviuoral.stratergy.payment.mode.CreditCardPayment;

public class Client {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new CreditCardPayment());
        PaymentDetails paymentDetails = new CreditCardDetails("1234-5678-9012-3456", "12/24", "123");

        paymentContext.executePayment(100.0,paymentDetails);
    }
}

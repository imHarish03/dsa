package dsa.pattern.behaviuoral.stratergy.payment;

import dsa.pattern.behaviuoral.stratergy.payment.details.CreditCardDetails;
import dsa.pattern.behaviuoral.stratergy.payment.details.PaymentDetails;
import dsa.pattern.behaviuoral.stratergy.payment.details.UpiDetails;
import dsa.pattern.behaviuoral.stratergy.payment.mode.CashPayment;
import dsa.pattern.behaviuoral.stratergy.payment.mode.CreditCardPayment;
import dsa.pattern.behaviuoral.stratergy.payment.mode.UpiPayment;

public class Client {
    public static void main(String[] args) {
//        PaymentContext<CreditCardDetails> paymentContext = new PaymentContext(new CreditCardPayment());
//        PaymentDetails paymentDetails = new CreditCardDetails("1234-5678-9012-3456", "12/24", "123");
//
//        paymentContext.executePayment(100.0,paymentDetails);
//

        UpiDetails upiDetails = new UpiDetails();
        PaymentContext<UpiDetails> upiContext = new PaymentContext<>(new UpiPayment());
        upiContext.executePayment(100.0, upiDetails);  // ✅ Safe and correct

    }
}

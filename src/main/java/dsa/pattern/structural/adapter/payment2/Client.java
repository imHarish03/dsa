package dsa.pattern.structural.adapter.payment2;

public class Client {

    public static void main(String[] args) {
       /* PaymentProcessor payment=new PaypalAdapter(new LegacyPayPalAPI());
        System.out.println("Payment via PaypalAdapter");
        payment.pay(100);
*/
        /// ///////////////////////
        CurrencyConverter converter = new StaticCurrencyConverter();
        PaymentProcessor payment2 = new PayPalInternationalAdapter(new LegacyInternationalPayPalAPI(),converter);
        payment2.pay(8300);  // INR 8300 should be converted to USD 100

    }

}

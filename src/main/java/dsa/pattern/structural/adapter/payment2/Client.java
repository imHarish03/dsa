package dsa.pattern.structural.adapter.payment2;

public class Client {

    public static void main(String[] args) {
        PaymentProcessor payment=new PaypalAdapter(new LegacyPayPalAPI());
        payment.pay(100);
    }

}

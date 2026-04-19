public class ClasaDeBaza {
    public static void main(String[] args) {

        Payment p = new CardPayment();
        p.pay(150);

        Payment p2 = new CashPayment();
        p2.pay(150);

        Payment p3 = new Paypal();
        p3.pay(150);

        Payment p4 = new MasterCard();
        p4.pay(150);

    }
}

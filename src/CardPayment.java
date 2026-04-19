public class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Plata cu card: " + amount);
    }
}

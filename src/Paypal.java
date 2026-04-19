public class Paypal implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Plata cu Paypal: " + amount);
    }
}

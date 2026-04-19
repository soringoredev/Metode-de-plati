public class MasterCard implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Plata cu MasterCard: " + amount);
    }
}

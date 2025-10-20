// Клас відвідувача ресторану
public class Customer extends User implements PaymentProcessor {
    private int tableNumber;

    public Customer(String name, int tableNumber) {
        super(name, "Customer");
        this.tableNumber = tableNumber;
    }

    public void scanMenu() {
        System.out.println("Відвідувач " + name + " сканує QR-код меню");
    }

    public void makeOrder() {
        System.out.println("Відвідувач " + name + " робить замовлення");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Відвідувач " + name + " оплачує " + amount + " грн безконтактно");
    }

    public void rateService(int rating) {
        System.out.println("Відвідувач " + name + " оцінює сервіс на " + rating + " зірок");
    }

    @Override
    public void displayInfo() {
        System.out.println("Відвідувач: " + name + ", Столик: " + tableNumber);
    }
}
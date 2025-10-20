// Клас шеф-кухаря
public class Chef extends User {
    private String specialization;

    public Chef(String name, String specialization) {
        super(name, "Chef");
        this.specialization = specialization;
    }

    public void markOrderReady(Order order) {
        System.out.println("Шеф-кухар " + name + " позначає замовлення як готове");
        order.setState(OrderState.READY);
    }

    @Override
    public void displayInfo() {
        System.out.println("Шеф-кухар: " + name + ", Спеціалізація: " + specialization);
    }
}
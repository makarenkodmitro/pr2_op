// Клас офіціанта
public class Waiter extends User {
    private final int employeeId;

    public Waiter(String name, int employeeId) {
        super(name, "Waiter");
        this.employeeId = employeeId;
    }

    public final void confirmOrder(Order order) {
        System.out.println("Офіціант " + name + " підтверджує замовлення та перевіряє алергени");
        order.setState(OrderState.CONFIRMED);
    }

    @Override
    public void displayInfo() {
        System.out.println("Офіціант: " + name + ", ID: " + employeeId);
    }
}
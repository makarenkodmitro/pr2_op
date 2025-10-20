// Клас замовлення
public class Order {
    private static int nextId = 1;
    private final int id;
    private OrderState state;
    private final Customer customer;
    private double amount;

    public Order(Customer customer, double amount) {
        this.id = nextId++;
        this.customer = customer;
        this.amount = amount;
        this.state = OrderState.CREATED;
    }

    public void setState(OrderState state) {
        this.state = state;
        System.out.println("Замовлення #" + id + " змінило стан на: " + state);
    }

    public void confirmPayment() {
        if (state == OrderState.READY) {
            customer.processPayment(amount);
            setState(OrderState.PAID);
        }
    }

    public void complete() {
        if (state == OrderState.PAID) {
            setState(OrderState.COMPLETED);
        }
    }

    public int getId() {
        return id;
    }

    public OrderState getState() {
        return state;
    }
}
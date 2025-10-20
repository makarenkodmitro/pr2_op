// Клас для замовлення
public class Order {
    private static int nextId = 1;
    private final int id;
    private String status;
    private final OrderItem[] items;
    private int itemCount;

    public Order() {
        this.id = nextId++;
        this.status = "Створене";
        this.items = new OrderItem[10];
        this.itemCount = 0;
    }

    public void addItem(String dish, int quantity) {
        if (itemCount < items.length) {
            items[itemCount++] = new OrderItem(dish, quantity);
            System.out.println("Додано до замовлення: " + dish + " x" + quantity);
        }
    }

    public void changeStatus(String status) {
        this.status = status;
        System.out.println("Замовлення #" + id + " змінило статус на: " + status);
    }

    public void displayOrder() {
        System.out.println("Замовлення #" + id + " (" + status + "):");
        for (int i = 0; i < itemCount; i++) {
            items[i].displayItem();
        }
    }
}
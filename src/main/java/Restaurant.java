// Головний клас для демонстрації роботи системи
public class Restaurant {
    public static void main(String[] args) {
        // Створення користувачів
        Customer customer = new Customer("Іван", 1);
        Waiter waiter = new Waiter("Марія", 101);
        Chef chef = new Chef("Петро", "Українська кухня");

        // Демонстрація процесу обслуговування
        System.out.println("\n=== Демонстрація роботи ресторану ===\n");

        customer.displayInfo();
        waiter.displayInfo();
        chef.displayInfo();

        System.out.println("\n--- Процес обслуговування ---\n");

        // Сканування меню та створення замовлення
        customer.scanMenu();
        customer.makeOrder();
        Order order = new Order(customer, 450.0);

        // Підтвердження замовлення офіціантом
        waiter.confirmOrder(order);

        // Приготування та позначення готовності
        order.setState(OrderState.COOKING);
        chef.markOrderReady(order);

        // Оплата та завершення
        order.confirmPayment();
        customer.rateService(5);
        order.complete();

        System.out.println("\n=== Демонстрацію завершено ===");
    }
}
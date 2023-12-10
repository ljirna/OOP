package Vjezba1911.RECORDS;
import java.util.Arrays;
import java.util.List;
public record Order(int orderId, String productName, int quantity, double unitPrice) {
}
class OrderProcessor{
    public static double calculateTotalOrderCost(List<Order> orders){
        return orders.stream()
                .mapToDouble(a -> a.unitPrice())
                .sum();
    }
}
class MainFour{
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(1,"F. Scott Fitzgerald",6,  25.0),
                new Order(2, "Harper Lee", 4,40.0),
                new Order(3,  "George Orwell",6, 12.0)
        );
        System.out.println(
                OrderProcessor.calculateTotalOrderCost(orders)
        );
    }
}
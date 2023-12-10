package Vjezba1911.RECORDS;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public record Product(int productID, String productName, double price) {
}
class ProductManager{
    public static List<Product> filterByPrice(List<Product> products, double maxPrice){
        return products.stream()
                .filter(blabla -> blabla.price()<=maxPrice)
                .toList();
    }
}
class Main{
    public static void main(String[] args) {
        List<Product> blabla=(List.of(
                        new Product(1, "Laptop", 1200.00),
                        new Product(2, "Smartphone", 600.00),
                        new Product(3, "Headphones", 80.00),
                        new Product(4, "Tablet", 300.00)
                )
        );

        // Display the filtered products
        System.out.println(
                ProductManager.filterByPrice(blabla, 300)
        );
    }
}
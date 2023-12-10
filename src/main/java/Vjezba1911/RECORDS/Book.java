package Vjezba1911.RECORDS;
import java.util.Arrays;
import java.util.List;
public record Book(int bookId, String title, String author, double price) {
}
class Bookstore{

    public static double calculateTotalBookCost (List<Book> books){
        return books.stream()
                .mapToDouble(a -> a.price())
                .sum();
    }
}
class MainTwo{
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book(1,"F. Scott Fitzgerald","The Great Gatsby",  25.5),
                new Book(2, "Harper Lee", "To Kill a Mockingbird",45.7),
                new Book(3,  "George Orwell","1984", 33.3)
        );
        System.out.println(
                Bookstore.calculateTotalBookCost(books)
        );
    }
}
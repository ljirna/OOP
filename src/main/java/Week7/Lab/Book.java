package Week7.Lab;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public record Book(String title, String author, int publicationYear, boolean availability){
}
class LibraryCatalog{
    private List<Book> books;
    public LibraryCatalog(List<Book> books){
        this.books = books;
    }
    public Optional<Book> checkAvailability(String title){
        return books.stream()
                .filter(book -> book.title().equals(title))
                .findFirst()
                .filter(book -> book.availability());
    }
    public Optional<Book> getFirstAvailableByAuthor(String autor){
        return books.stream()
                .filter(book -> book.author().equals(autor))
                .findFirst();
    }
    public void updateAvailability(String title, boolean availability){
        books.stream()
                .filter(book -> book.title().equals(title))
                .findFirst();
    }
}
class MainThree {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, true),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960, false),
                new Book("1984", "George Orwell", 1949, true)
        );

        LibraryCatalog libraryCatalog = new LibraryCatalog(bookList);

        Optional<Book> availableBook = libraryCatalog.checkAvailability("1984");
        System.out.println("Is '1984' available? " + availableBook.isPresent());

        Optional<Book> firstAvailableByAuthor = libraryCatalog.getFirstAvailableByAuthor("J.D. Salinger");
        System.out.println("First available book by J.D. Salinger: " + firstAvailableByAuthor.orElse(null));

        libraryCatalog.updateAvailability("To Kill a Mockingbird", true);
        System.out.println("Updated availability of 'To Kill a Mockingbird'");
    }
}
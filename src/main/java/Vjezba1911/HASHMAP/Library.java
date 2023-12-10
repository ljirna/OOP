package Vjezba1911.HASHMAP;
import java.util.HashMap;

class Book {
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double weight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return this.writer + ": " + this.name;
    }
}

public class Library{
    private HashMap<String, Book> bookCollection = new HashMap<String, Book>();

    public void addBook(Book book){
        bookCollection.put(stringCleaner(book.getName()), book);

    }

    public void removeBook(String bookName){
        bookCollection.remove(stringCleaner(bookName));

    }
    private String stringCleaner(String string){
        string.trim();
        string.toLowerCase();

        return string;
    }
}

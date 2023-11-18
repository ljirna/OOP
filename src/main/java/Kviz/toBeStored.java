package Kviz;

import java.util.ArrayList;
interface toBeStored {
    double weight();
}
class Book implements toBeStored{
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight){
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }
    public double weight(){
        return this.weight;
    }

    public String toString(){
        return this.writer + ": " + this.name;
    }
}
class CD{
    private String artist;
    private String title;
    private int publishing_year;
    private double weight;
    public CD(String artist, String title, int publishing_year, double weight){
        this.artist = artist;
        this.title = title;
        this.weight = 0.1;
        this.publishing_year = publishing_year;
    }
    public double weight(){
        return this.weight;
    }
    public String toString(){
        return this.artist + ": " + this.title + " (" + this.publishing_year + ")";
    }
}
class Thing implements toBeStored{
    private double weight;
    @Override
    public double weight() {
        return 0;
    }
}
class Box {
    private ArrayList<toBeStored> things;
    private double maximum;

    public Box(double maximum) {
        this.maximum = maximum;
        this.things = new ArrayList<>();
    }

    public int add(toBeStored thing) {
        if (maximum > thing.weight()) {
            things.add(thing);
            return things.size();
        }
        else {
            return -1;
        }
    }
    public double totalWeight() {
        double sum = 0;
        for (toBeStored thing : this.things) {
            sum += thing.weight();
        }
        return sum;
    }
}
class MainTwo{
    public static void main(String[] args) {
        Box box = new Box(10);
        box.add(new Book("Fedor Dostojevski", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        Object totalWeight;
        System.out.println("Total weight of the box: " + box);
    }
}


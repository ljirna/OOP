package Week5.lab.SecondProblem;
import java.util.ArrayList;
public interface toBeStored {
    double weight();
}
class Book implements toBeStored {
    private String name;
    private String writer;
    private double weight;
    public Book(String name, String writer, double weight) {
        this.name = name;
        this.writer = writer;
        this.weight = weight;
    }
    public double weight(){
        return weight;
    }
    public String toString(){
        return (this.writer + ": " + this.name + this.weight);
    }
}

class CD implements toBeStored {
    private String artist;
    private String title;
    private int publishingYear;
    private double weight;
    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
        this.weight = 0.1;
    }
    public double weight(){
        return this.weight;
    }
    public String toString(){
        return (this.artist + ": " + this.title + "(" + this.publishingYear + ")");
    }
}
class Thing implements toBeStored {
    @Override
    public double weight() {
        return this.weight();
    }
}
class Box {
    private final ArrayList<toBeStored> things;
    private final double maxCapacity;
    public Box(ArrayList<toBeStored> things, double maxCapacity) {
        this.things = new ArrayList<toBeStored>();
        this.maxCapacity = maxCapacity;
    }
    public void add(toBeStored thing){
        if(maxCapacity > thing.weight()){
            things.add(thing);
        }
    }
    public double totalWeight(){
        double sum = 0;
        for(toBeStored a : this.things){
            sum = sum + a.weight();
        }
        return sum;
    }
    public String toString(){
        return "Box: " + this.things.size() + " things, total weight " + this.totalWeight() + " kg.";
    }
}

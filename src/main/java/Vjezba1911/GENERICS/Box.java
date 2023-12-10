package Vjezba1911.GENERICS;
import java.util.List;
public class Box <T>{
    private T item;
    public Box(T item){
        this.item = item;
    }
    public T getItem(){
        return item;
    }
    public void setItem(T newItem){
        this.item = newItem;
    }

    @Override
    public String toString(){
        return "Item: " + this.item;
    }
}
class ColoredBox<T> extends Box{
    private String color;
    public ColoredBox(T item, String color){
        super(item);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString(){
        return "Item: " +  this.getItem() + "\n" + "Color: " + this.color;
    }
}
class Main{
    public static void main(String[] args) {
        Box a = new Box<>("luka je idiot");
        Box b = new Box<>("Mirna je pametna");

        ColoredBox aa = new ColoredBox<>("Luka ", "Idiot");
        ColoredBox bb = new ColoredBox<>("Mirna ", "prepametnica");

        System.out.println(bb);
    }
}
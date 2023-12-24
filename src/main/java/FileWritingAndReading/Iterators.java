package FileWritingAndReading;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("orange");
        Iterator<String> it = fruits.iterator();
        while(it.hasNext()){
            String fruit = it.next();
            System.out.println(fruit);
        }
    }
}

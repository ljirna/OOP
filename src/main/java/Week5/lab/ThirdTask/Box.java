package Week5.lab.ThirdTask;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.Collection;

class Thing{
    private double weight;
    private final String name;
    public double weight(){
        return this.weight;
    }
    public String getName(){
        return this.name;
    }
    public Thing(double weight, String name){
        if(weight > 0 ){
            this.weight = weight;
        }
        else{
            throw new IllegalArgumentException();
        }
        this.name = name;
    }
    public Thing(String name){
        this.name = name;
    }
}
public abstract class Box{
    public abstract void add(Thing thing);
    public void add(Collection<Thing> things){
        for(Thing thing : things){
            add(thing);
        }
    }
    public abstract boolean isInBox(Thing thing);
}
class MaxWeight extends Box{
    private ArrayList<Thing> things = new ArrayList<>();
    private int maximumWeight;
    private int weightInBox;
    public MaxWeight(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.weightInBox = 0;
    }
    @Override
    public void add(Thing thing) {
        if(this.weightInBox < this.maximumWeight){
            this.weightInBox += thing.weight();
            things.add(thing);
        }
    }
    @Override
    public boolean isInBox(Thing thing) {
        for(Thing t : things){
            if(t.getName().equals(thing.getName())){
                return true;
            }
        }
        return false;
    }
}
class OneThingBox extends Box{
    private ArrayList<Thing> things = new ArrayList<>();
    public OneThingBox(){

    }
    @Override
    public void add(Thing thing) {
        if(this.things.size() < 1){
            things.add(thing);
        }
    }

    @Override
    public boolean isInBox(Thing thing) {
        for(Thing t : things){
            if(t.getName().equals(thing.getName())){
                return true;
            }
        }
        return false;
    }
}
class BlackHoleBox extends Box{
    private ArrayList<Thing> things = new ArrayList<>();
    public BlackHoleBox(){

    }
    @Override
    public void add(Thing thing) {
        things.add(thing);
    }

    @Override
    public boolean isInBox(Thing thing) {
        return false;
    }
}

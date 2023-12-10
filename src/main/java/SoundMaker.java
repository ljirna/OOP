public interface SoundMaker {
    public void makeSound();
}
abstract class Animal{
    private String name;
    public Animal(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract void eat();
}
class Lion extends Animal implements SoundMaker{
    public Lion(String name){
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Roar loudly");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " eats meat");
    }
}
class Elephant extends Animal implements SoundMaker{
    public Elephant(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println("Trumpets loudly");
    }
    @Override
    public void eat(){
        System.out.println(getName() + " eats grass");
    }
}
class ZooSimulation {
    public static void main(String[] args) {
        // Create instances of animals
        Lion lion = new Lion("Leo");
        Elephant elephant = new Elephant("Ellie");

        // Feed and make sounds of animals
        feedAndMakeSound(lion);
        feedAndMakeSound(elephant);
    }

    // Method to feed and make sound for an animal
    private static void feedAndMakeSound(Animal animal) {
        System.out.println("Feeding " + animal.getName() + ":");
        animal.eat();

        if (animal instanceof SoundMaker) {
            SoundMaker soundMaker = (SoundMaker) animal;
            System.out.println("Making sound:");
            soundMaker.makeSound();
        }

        System.out.println();
    }
}
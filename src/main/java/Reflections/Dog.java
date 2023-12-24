package Reflections;

public class Dog {
    private final int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bark(){
        System.out.println("aw aw");
    }
    public static void somethingOne(){
        System.out.println("This is both static and public");
    }
    private static void somethingTwo(){
        System.out.println("This is both static and private");
    }
}

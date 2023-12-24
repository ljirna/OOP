package Reflections;

public class Cat {
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void meow(){
        System.out.println("Meow");
    }

    private void heyThisIsPrivate(){
        System.out.println("How did you get this");
    }

    public static void thisIsPublicStatic(){
        System.out.println("Public and static");
    }

    private static void thisIsPrivateStatic(){
        System.out.println("Private and static");
    }
}

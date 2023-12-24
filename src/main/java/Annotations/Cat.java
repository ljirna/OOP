package Annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@VeryImportant
public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @RunImmendiately
    public static void eat(){
        System.out.println("munch");
    }
    public static void meow(){
        System.out.println("meow");
    }
}
class creatingAnnotations{
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat myCat = new Cat("Stella", 3);
        if(myCat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("that is important");
        }
        for(Method m : myCat.getClass().getDeclaredMethods()){
            m.isAnnotationPresent(RunImmendiately.class);
            m.invoke(myCat);
        }
    }
}
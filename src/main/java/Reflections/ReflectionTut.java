package Reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static Reflections.Cat.thisIsPublicStatic;

public class ReflectionTut {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat myCat = new Cat("Stella", 6);
        Field[] catFieled = myCat.getClass().getDeclaredFields();
        for(Field f : catFieled){
            if(f.getName().equals("name")){
                f.setAccessible(true);
                f.set(myCat, "Mirna");
            }
        }
        System.out.println(myCat.getName());
        Method[] catMethods = myCat.getClass().getDeclaredMethods();
        for(Method m : catMethods){
            if(m.getName().equals("thisIsPrivateStatic")){
                m.setAccessible(true);
                m.invoke(myCat);
                myCat.meow();
                m.invoke(null);
            }
        }
    }
}

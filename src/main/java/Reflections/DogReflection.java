package Reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DogReflection {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Dog myDog = new Dog(9, "Max");
        Field[] fields = myDog.getClass().getDeclaredFields();
        Method[] methods = myDog.getClass().getDeclaredMethods();
        for(Field f : fields){
            if(f.getName().equals("age")){
                f.setAccessible(true);
                f.set(myDog, 12);
                System.out.println(myDog.getAge());
            }
        }
        for(Method m : methods){
            if(m.getName().equals("somethingTwo")){
                m.setAccessible(true);
                m.invoke(null);
            }
        }
    }
}

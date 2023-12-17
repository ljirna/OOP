package Vjezba1512;

public class NullPointer {
    public static void main(String[] args) {
        String str = null;
        returnLength(str);
    }
    public static void returnLength(String str){
        try{
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("That is not a string");
        }
    }
}

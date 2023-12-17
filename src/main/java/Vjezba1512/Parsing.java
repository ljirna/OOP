package Vjezba1512;

public class Parsing {
    public static void main(String[] args) {
        try{
            int number = Integer.parseInt("Mirna");
        }
        catch(NumberFormatException e){
            System.out.println("Can't parse that into an integer");
        }
    }
}

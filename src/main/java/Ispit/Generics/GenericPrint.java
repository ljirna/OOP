package Ispit.Generics;

class GenericPrint <T>{
    private T thingToPrint;

    public GenericPrint(T thingToPrint){
        this.thingToPrint=thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}
class Main{
    public static void main(String[] args) {
        GenericPrint<Integer> intPrinter = new GenericPrint<>(25);
        intPrinter.print();
        GenericPrint<String> stringPrinter= new GenericPrint<>("Mirna");
        stringPrinter.print();
    }
}
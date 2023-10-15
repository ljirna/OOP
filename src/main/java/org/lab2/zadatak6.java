package org.lab2;
import java.util.Scanner;
public class zadatak6 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter how many times to print the text: ");
        int number = Integer.parseInt(reader.nextLine());
        for(int i=0; i<number; i++){
            printText();
        }
    }
    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}

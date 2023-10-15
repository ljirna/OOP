package org.lab2;
import java.util.Scanner;
public class zadatak4 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.println("Enter second number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        if(number1 <= number2){
            int i = number1;
            while(i <= number2){
                System.out.println(i);
                i++;

            }
        }
        else{
            System.out.println();
        }
    }
}

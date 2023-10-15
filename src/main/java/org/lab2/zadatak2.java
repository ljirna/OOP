package org.lab2;
import java.util.Scanner;
public class zadatak2 {
    public static void main(String[] args){
        int sum=0;
        int read=3;
        Scanner reader = new Scanner(System.in);
        for(int i=0; i<read; i++){
            System.out.println("Enter a number: ");
            int number = Integer.parseInt(reader.nextLine());
            sum += number;
        }
        System.out.println("Sum is " + sum);
    }
}

package org.lab2;
import java.util.Scanner;
public class zadatak5 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int i = 0;
        while(i <= number){
            int result = (int)Math.pow(number, i);
            sum += result;
            i++;
        }
        System.out.println(sum);
    }
}

package org.lab2;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
public class zadatak1 {
    public static void main(String[] args) {
        while(true){
            System.out.println("enter a password: ");
            Scanner reader = new Scanner(System.in);
            String password = reader.nextLine();
            if(password.equals("carrot")){
                System.out.println("Right!");
                System.out.println("Secret: jryy qbar");
                break;
            }
            else{
                System.out.println("Wrong!");
            }
        }
    }
}
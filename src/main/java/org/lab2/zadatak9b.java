package org.lab2;

public class zadatak9b {
    public static void main(String[] args){
        printPyramid(10);
    }
    public static void printPyramid(int number){
        for(int i=1; i<=number; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

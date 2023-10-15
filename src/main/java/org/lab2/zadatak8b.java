package org.lab2;

public class zadatak8b {
    public static void main(String[] args){
        printPyramid(10);
    }
    public static void printPyramid(int rows){
        for(int i=rows; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

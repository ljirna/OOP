package org.lab2;

public class zadatak8 {
    public static void main(String[] args){
        printPyramid(10);
    }
    public static void printPyramid(int row){
        for(int i=0; i<=row; i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

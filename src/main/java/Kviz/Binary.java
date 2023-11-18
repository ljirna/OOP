package Kviz;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {
    public static boolean search(int[] arr, int value){
        Arrays.sort(arr);
        int middle, left = 0, right = arr.length - 1;
        while(left <= right){
            middle = left + (right-left)/2;
            if(arr[middle] == value){
                return true;
            }
            if (arr[middle] < value){
                left = middle + 1;
            }
            if(arr[middle] > value){
                right = left - 1;
            }
        }
        return false;
    }
}
class main{
    public static void main(String[] args) {
        int[] arr = {2,5,1,8,9,19,65,44};
        Scanner reader = new Scanner(System.in);
        System.out.println("Values of the array: " + Arrays.toString(arr));
        System.out.println();
        System.out.println("Enter your searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();
    }
}
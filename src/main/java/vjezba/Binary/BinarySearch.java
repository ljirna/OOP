package vjezba.Binary;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static boolean search(int[] arr, int searchedValue){
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        int middle;
        while(left <= right){
            middle = left + (right-left)/2;
            if(arr[middle] == searchedValue){
                return true;
            }
            if(arr[middle] < searchedValue){
                left = middle + 1;
            }
            else{
                right = middle - 1;
            }
        }
        return false;
    }
}
class Main{
    public static void main(String[] args) {
        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader = new Scanner(System.in);
        System.out.println("Values of the array: " + Arrays.toString(array));
        System.out.println();
        System.out.println("Enter your searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        boolean result = Week6.lab.Five.BinarySearch.search(array, Integer.parseInt(searchedValue));
        System.out.println((result) ? ("Value " + searchedValue + " is in the array") : ("Value " + searchedValue + " is not in the array"));
    }
}
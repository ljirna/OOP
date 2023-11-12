package Week6.lab.Five;

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    int binarySearch(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (arr[middle] == x)
                return middle;

            if (arr[middle] < x)
                left = middle + 1;
            else
                right = middle - 1;
        }
        return -1;
    }

    public static boolean search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader = new Scanner(System.in);
        System.out.println("Values of the array: " + Arrays.toString(array));
        System.out.println();
        System.out.println("Enter your searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));
        System.out.println((result) ? ("Value " + searchedValue + " is in the array") : ("Value " + searchedValue + " is not in the array"));
    }
}

package Week6.lab;

import java.util.Arrays;

public class Main {
    public static int smallest(int[] array) {
        int smallestValue = array[0];
        for(int num : array){
            if(num < smallestValue){
                smallestValue = num;
            }
        }
        return smallestValue;
    }

    public static void main(String[] args) {
        int numbers[] = {10, 12, 17, 9, 90, 77};
        System.out.println("Smallest value: " + smallest(numbers));
        System.out.println("Index of the smallest: " + indexOfTheSmalles(numbers));
        System.out.println("Number of an index is: " + indexOfTheSmallestStartingFrom(numbers, 3));
        System.out.println(Arrays.toString(numbers));
        swap(numbers, 2, 3);
        System.out.println(Arrays.toString(numbers));
    }
    public static int indexOfTheSmalles(int[] array){
        int smallest = array[0];
        int smallestIndex = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int smallestNo = array[index];
        int smallestInd = index;
        for(int i=index; i<array.length; i++){
            smallestNo = array[i];
            smallestInd = i;
        }
        return smallestInd;
    }
    public static void swap(int[] array, int indexOne, int indexTwo){
        int temp = array[indexOne];
        array[indexOne]  = array[indexTwo];
        array[indexTwo] = temp;
    }
}

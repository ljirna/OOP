package Ispit.Binary;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8};
        System.out.println(searching(numbers, 8));
    }
    private static int searching(int[] arr, int searcValue){
        int first = 0;
        int last = arr.length - 1;

        while(first <= last){
            int middlePosition = (first+last)/2;
            int middleNumber = arr[middlePosition];
            if(searcValue == middleNumber){
                return middlePosition;
            }
            if(searcValue<middleNumber){
                last = middlePosition - 1;
            }
            else {
                first = middlePosition + 1;
            }
        }
        return -1;
    }
}

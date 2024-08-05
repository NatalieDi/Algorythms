package hw.homework_1.linearsearch;

import java.util.Arrays;

public class LinearSearchArray {
    public static void main(String[] args) {
        int index = linearSearchArray(new int[] { 5, 0, 9, 6, 3, 8}, 6);
        if (index == -1)
            System.out.println("Element is not present in the array"+ Arrays.toString(new int[]{5, 0, 9, 6, 3, 8}));
        else
            System.out.println("Element 6 found at position " + index + " in the array "+ Arrays.toString(new int[]{5, 0, 9, 6, 3, 8}));
    }

    public static int linearSearchArray(int arr[], int x) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }

        return -1;
    }
}

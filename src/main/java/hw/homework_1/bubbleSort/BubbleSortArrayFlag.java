package hw.homework_1.bubbleSort;

import java.util.Arrays;

public class BubbleSortArrayFlag {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(bubbleSorting(new int[]{5, 9, 1, 8, 7, 0})));
    }
    public static int[] bubbleSorting( int[] array){
         boolean isSorted = false;
         while (!isSorted){
             isSorted = true;
             for (int i = 1; i < array.length; i++) {
                 if (array[i] < array[i-1]) {
                   int temp = array[i];
                   array[i] = array[i-1];
                   array[i-1] = temp;
                   isSorted = false;
                 }

             }
         }
     return array;
    }
}

package hw.homework_1.bubbleSort;

import java.util.Arrays;

public class BubbleSortArrayLoops {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(bubbleSorting(new int[]{5, 9, 1, 8, 7, 0})));
    }
    public static int[] bubbleSorting( int[] array){
        int len = array.length;
         for (int k = 0; k < len; k++) {
            for (int i = k + 1; i < len; i++) {
               if (array[k] > array[i]) {
                   int temp = array[k];
                   array[k] = array[i];
                   array[i] = temp;
               }
           }
       }
     return array;
    }
}

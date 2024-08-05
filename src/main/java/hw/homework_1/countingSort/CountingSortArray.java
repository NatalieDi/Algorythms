package hw.homework_1.countingSort;

import java.util.Arrays;

public class CountingSortArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(CountSort(new int[]{5, 0, 7, 7, 9, 1, 9, 9, 9, 8, 7, 0})));
    }
    private static int[] CountSort(int[] array){
            int k = array[0];
             for (int i = 1; i < array.length; i++) {
                if (array[i] > k) {
                   k = array[i];
                }
             }
             int[] counts = new int[k + 1];

            for (int num : array) {
                counts[num]++;
            }

            int index = 0;
            for (int i = 0; i <= k; i++) {
                while (counts[i] > 0) {
                    array[index] = i;
                    index++;
                    counts[i]--;
                }
            }
            return array;
    }
}




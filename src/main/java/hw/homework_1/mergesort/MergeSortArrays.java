package hw.homework_1.mergesort;

import java.util.Arrays;

public class MergeSortArrays {
    public static void main(String[] args) {
        System.out.print(Arrays.toString(mergeSort(new int[]{10, 6, 8, 5, 7, 3, 4})));
    }

    public static int[] mergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
        return array;
    }

    private static void mergeSort(int[] array, int leftStart, int rightEnd) {
        if (leftStart < rightEnd) {
            int middle = leftStart + (rightEnd - leftStart) / 2;
            mergeSort(array, leftStart, middle);
            mergeSort(array, middle + 1, rightEnd);
            merge(array, leftStart, middle, rightEnd);
        }
    }

    private static void merge(int[] array, int leftStart, int middle, int rightEnd) {
        int leftSize = middle - leftStart + 1;
        int rightSize = rightEnd - middle;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        System.arraycopy(array, leftStart, leftArray, 0, leftSize);
        System.arraycopy(array, middle + 1, rightArray, 0, rightSize);

        int leftIndex = 0, rightIndex = 0, mergedIndex = leftStart;

        while (leftIndex < leftSize && rightIndex < rightSize) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                array[mergedIndex++] = leftArray[leftIndex++];
            } else {
                array[mergedIndex++] = rightArray[rightIndex++];
            }
        }

        while (leftIndex < leftSize) {
            array[mergedIndex++] = leftArray[leftIndex++];
        }

        while (rightIndex < rightSize) {
            array[mergedIndex++] = rightArray[rightIndex++];
        }
    }
}

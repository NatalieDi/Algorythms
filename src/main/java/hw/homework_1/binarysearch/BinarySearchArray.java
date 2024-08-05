package hw.homework_1.binarysearch;
import java.util.Arrays;

public class BinarySearchArray {
    public static void main(String[] args) {
        System.out.println(binarySearchArray(new int[] { 5, 0, 9, 6, 3, 8}, 2));
    }
    public static int binarySearchArray(int[] arr, int target) {
        int len = arr.length;
        int left = 0;
        int right = len - 1;
        Arrays.sort(arr);

        while (left <= right) {
            int middleIndex = left + (right - left) / 2;
            int cur = arr[middleIndex];

            if (cur == target) {
                return middleIndex;
            } else if (cur < target) {
                left = middleIndex + 1;
            } else {
                right = middleIndex - 1;
            }
        }
        return -1;
    }

}

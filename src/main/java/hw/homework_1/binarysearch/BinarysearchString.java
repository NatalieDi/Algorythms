package hw.homework_1.binarysearch;

import java.util.Arrays;

public class BinarysearchString {

    public static void main(String[] args) {
        System.out.println("Original String = Hello, World!");
        System.out.println("Sorted String =  !,HWdellloor");
        System.out.println("Symbol 'd' has index "+ binarySearching("Hello, World!", 'd')+ " in sorted string");
    }

    public static int binarySearching(String str, char target) {
        char[] chars = str.toCharArray();
        int len = str.length();
        int left = 0;
        int right = len - 1;
        Arrays.sort(chars);

        while (left <= right) {
            int middleIndex = left + (right - left) / 2;
            char currentChar = chars[middleIndex];

            if (currentChar == target) {
                return middleIndex;
            } else if (currentChar < target) {
                left = middleIndex + 1;
            } else {
                right = middleIndex - 1;
            }
        }
        return -1;
    }
}
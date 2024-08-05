package hw.homework_1.mergesort;

public class MergeSortString {
    public static void main(String[] args) {
        System.out.print(mergeSortString("Hello, World!"));
    }

    public static String mergeSortString(String input) {
        return mergeSort(input);
    }

    private static String mergeSort(String input) {
        int length = input.length();
        if (length <= 1) {
            return input;
        }

        int middle = length / 2;
        String left = input.substring(0, middle);
        String right = input.substring(middle);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static String merge(String left, String right) {
        StringBuilder merged = new StringBuilder();
        int leftIndex = 0, rightIndex = 0;

        while (leftIndex < left.length() && rightIndex < right.length()) {
            if (left.charAt(leftIndex) <= right.charAt(rightIndex)) {
                merged.append(left.charAt(leftIndex++));
            } else {
                merged.append(right.charAt(rightIndex++));
            }
        }

        while (leftIndex < left.length()) {
            merged.append(left.charAt(leftIndex++));
        }

        while (rightIndex < right.length()) {
            merged.append(right.charAt(rightIndex++));
        }

        return merged.toString();
    }
}
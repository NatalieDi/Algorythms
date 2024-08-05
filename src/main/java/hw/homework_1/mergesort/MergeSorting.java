package hw.homework_1.mergesort;

public class MergeSorting {
    public static void main(String[] args) {
        MergeSorting sorter = new MergeSorting();
        System.out.print(sorter.sort("Hello, World!"));
    }

    public String sort(String str) {

        if (str.length() <= 1) {
            return str;
        }

        int middle = str.length() / 2;
        String left = str.substring(0, middle);
        String right = str.substring(middle);

        return merge(sort(left), sort(right));
    }

    private String merge(String left, String right) {

        StringBuilder merged = new StringBuilder();
        int leftIndex = 0, rightIndex = 0;

        while (leftIndex < left.length() && rightIndex < right.length()) {
            char leftChar = left.charAt(leftIndex);
            char rightChar = right.charAt(rightIndex);

            if (leftChar <= rightChar) {
                merged.append(leftChar);
                leftIndex++;
            } else {
                merged.append(rightChar);
                rightIndex++;
            }
        }

        merged.append(left.substring(leftIndex));
        merged.append(right.substring(rightIndex));

        return merged.toString();
    }
}


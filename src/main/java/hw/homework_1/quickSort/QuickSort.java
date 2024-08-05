package hw.homework_1.quickSort;

public class QuickSort {
    public static void main(String[] args) {
        System.out.print(sort("Hello, World!"));
    }

    private static String sort(String str) {
        char[] charArray = str.toCharArray();
        quickSort(charArray, 0, charArray.length - 1);
        return new String(charArray);
    }

    private static void quickSort(char[] array, int low, int high) {
        if (low < high) {
            char pivotElement = array[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (array[j] <= pivotElement) {
                    char temp = array[i + 1];
                    array[i + 1] = array[j];
                    array[j] = temp;
                    i++;
                }
            }

            char temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;

            quickSort(array, low, i);
            quickSort(array, i + 2, high);
        }
    }
}

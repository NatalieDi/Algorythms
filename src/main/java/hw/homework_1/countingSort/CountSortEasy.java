package hw.homework_1.countingSort;

public class CountSortEasy {
        public static void main(String[] args) {
            System.out.println("Отсортированная строка: " + countingSort("Hello, World!"));
        }

        private static String countingSort(String str) {
            int[] count = new int[256]; // Предполагаем, что используется кодировка ASCII
            int len = str.length();

            // Подсчет частот
            for (int i = 0; i < len ; i++) {
                char c = str.charAt(i);
                count[c]++;
            }

            // Сортировка
            char[] sortedArray = new char[len];
            int index = 0;
            for (int i = 0; i < count.length; i++) {
                while (count[i] > 0) {
                    sortedArray[index] = (char) i;
                    index++;
                    count[i]--;
                }
            }

            return new String(sortedArray);
        }
    }



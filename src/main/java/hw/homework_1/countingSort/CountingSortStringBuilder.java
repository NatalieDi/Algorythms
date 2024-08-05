package hw.homework_1.countingSort;

public class CountingSortStringBuilder {
    public static void main(String[] args) {
        System.out.println(CountsSort("mama"));
    }
    private static StringBuilder CountsSort(String str){
        StringBuilder sortedString = new StringBuilder(str);

        // Подсчет частот
        int[] count = new int[26]; // Предполагаем, что строка состоит из маленьких букв английского алфавита
        for (char c : sortedString.toString().toCharArray()) {
            count[c - 'a']++;
        }

        // Сортировка
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                sortedString.setCharAt(index, (char) ('a' + i));
                index++;
                count[i]--;
            }
        }
        return sortedString;

    }
}

package hw.homework_1.countingSort;

public class CountingSortStringBuilderGeneral {
     public static void main(String[] args) {
        System.out.println(CountsSort("Hello, World!"));
     }
    private static String CountsSort(String str){
//        StringBuilder sortedString = new StringBuilder(str);
//                int[] count = new int[256];
//                for (char c : str.toCharArray()) {
//                    count[c]++;
//                }
//
//                for (int i = 0; i < count.length; i++) {
//                    while (count[i] > 0) {
//                        sortedString.append((char) i);
//                        count[i]--;
//                    }
//                }
//                return sortedString;
//
//    }
//
//        int[] count = new int[256]; // Предполагаем, что используется кодировка ASCII
//
//        // Подсчет частот
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            count[c]++;
//        }
//
//        // Сортировка
//        StringBuilder sortedString = new StringBuilder();
//        for (int i = 0; i < count.length; i++) {
//            while (count[i] > 0) {
//                sortedString.append((char) i);
//                count[i]--;
//            }
//        }
//
//        return sortedString.toString();
//    }
        int len = str.length();
        int[] count = new int[256];

        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            count[c]++;
        }

        StringBuilder sortedString = new StringBuilder();

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                sortedString.append((char) i);
                count[i]--;
            }
        }

        return sortedString.toString();

    }

}

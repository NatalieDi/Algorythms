package hw.homework_1.bubbleSort;


public class BubbleSortStringBuilder {

        public static void main(String[] args) {

            System.out.println(bubbleSortString("maman"));
        }
        public static String bubbleSortString(String str) {
//            StringBuilder sortedString = new StringBuilder(str);
//            for (int i = 0; i < sortedString.length() - 1; i++) {
//                for (int j = 0; j < sortedString.length() - i - 1; j++) {
//                    if (sortedString.charAt(j) > sortedString.charAt(j + 1)) {
//                        char temp = sortedString.charAt(j);
//                        sortedString.setCharAt(j, sortedString.charAt(j + 1));
//                        sortedString.setCharAt(j + 1, temp);
//                    }
//                }
//
//            }
//            return sortedString;
            StringBuilder sortedString = new StringBuilder(str);
            int len = sortedString.length()-1;

            for (int i = 0; i < len; i++) {

                for (int j = 0; j < len - i; j++) {

                    if (sortedString.charAt(j) > sortedString.charAt(j + 1)) {

                        char temp = sortedString.charAt(j);
                        sortedString.setCharAt(j, sortedString.charAt(j + 1));
                        sortedString.setCharAt(j + 1, temp);
                    }
                }
            }

            return sortedString.toString();
        }

}



package hw.homework_1.bubbleSort;

public class BubbleSortStrFlag2 {
    public static void main(String[] args) {

        System.out.println(bubbleSort("Hello, World!"));
    }
    public static String bubbleSort( String str){

        int len =  str.length();
        boolean isSorted = false;

         while (!isSorted){
             isSorted = true;
             for (int i = 1; i < len; i++) {
                 if (str.charAt(i) < str.charAt(i-1)) {
                   char temp = str.charAt(i);
                     str = str.substring(0, i-1) + str.charAt(i) + str.charAt(i-1) + str.substring(i+1);
                   isSorted = false;
                 }

             }
         }
     return str;
    }
//        boolean swapped;
//        for (int i = 0; i < str.length() - 1; i++) {
//            swapped = false;
//            for (int j = 0; j < str.length() - 1 - i; j++) {
//                if (str.charAt(j) > str.charAt(j + 1)) {
//                    str = str.substring(0, j) + str.charAt(j + 1) + str.charAt(j) + str.substring(j + 2);
//                    swapped = true;
//                }
//            }
//            if (!swapped) {
//                break;
//            }
//        }
//        return str; //!,HWdellloor
//    }
}

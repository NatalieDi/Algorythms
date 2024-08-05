package hw.homework_1.bubbleSort;

public class StrBubbleSort {
    public static void main(String[] args) {
        System.out.println(bubbleSorting("natali".toCharArray()));
    }
    public static char[] bubbleSorting( char[] str){
        int len = str.length;
        for (int k = 0; k < len-1; k++) {
            for (int i = k + 1; i < len; i++) {
                if (str[k] > str[i]) {
            char temp = str[k];
            str[k]= str[i];
            str[i] = temp; }
        }
        }
        return str;
    }
}


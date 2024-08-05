package hw.homework_1.countingSort;

import java.util.Arrays;

public class CountingSort_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByCountingMethod(new int[]{5, 0, 7, 7, 9, 1, 9, 9, 9, 8, 7, 0})));
    }
    private static int[] sortArrayByCountingMethod(int[] array) {
        //Найдём максимальное число в массиве
        int k = array[0]; //Максимальное число в массиве
        for (int i = 1; i < array.length; i++) {
            if (array[i] > k) {
                k = array[i];
            }
        }

        //Создадим новый массив длины k, по умолчанию наполненный нулями
        int[] tempArray = new int[k + 1];

        //Запишем в него количество вхождений каждого элемента поиндексно
        for (int value : array) {
            ++tempArray[value];
        }

        //Вставим элементы в исходный массив
        int b = 0;
        for (int i = 0; i < k + 1; i++) {
            for (int j = 0; j < tempArray[i]; j++) {//[0, 0, 1, 5, 7 , 7 ,7, 8, 9, 9, 9, 9]
                array[b++] = i;
            }
        }
    return array;
    }
}

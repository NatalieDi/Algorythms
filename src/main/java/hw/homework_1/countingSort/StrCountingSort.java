package hw.homework_1.countingSort;

public class StrCountingSort {
    public static void main(String[] args) {
        char[] array = sortArrayByCountingMethod("mama".toCharArray());
        System.out.println(new String(array));
    }
    private static char[] sortArrayByCountingMethod(char[] array) {
        //Найдём максимальное число в массиве
        int k = array[0];
        // Максимальное число в массиве
        for (int i = 1; i < array.length; i++) {
        if (array[i] > k) {
            k = array[i];
        }
        }
        //Создадим новый массив длины k, по умолчанию наполненный нулями
        int[] tempArray = new int[k + 1];
        //Запишем в него количество вхождений каждого элемента поиндексно
        for (char value : array) {
            ++tempArray[value];
        }

    //Вставим элементы в исходный массив
    int b = 0;
    for (int i = 0; i < k + 1; ++i) {
        for (int j = 0; j < tempArray[i]; ++j) {
            array[b++] = (char) i; } }
    return array;
   }
}

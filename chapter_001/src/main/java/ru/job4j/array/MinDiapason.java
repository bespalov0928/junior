package ru.job4j.array;

/**
 * class MinDiapason поиск минимального значения в диапазоне
 * @author bespalov
 * @version 1.0
 */
public class MinDiapason {
    /**
     *
     * @param array масив
     * @param start начальный индекс
     * @param finish конечный индекс
     * @return результат
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index <= finish; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}

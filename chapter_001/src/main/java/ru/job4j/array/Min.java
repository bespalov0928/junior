package ru.job4j.array;

/**
 * class Min поиск минимального числа
 * @author bespalov
 * @version 1/0
 */
public class Min {
    /**
     *
     * @param array - массив исходный
     * @return найденное минимально значение
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}

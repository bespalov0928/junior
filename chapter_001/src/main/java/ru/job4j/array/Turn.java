package ru.job4j.array;

/**
 * class Turn сортирова массива
 * @author bespalov
 */
public class Turn {

    /**
     * меняет порядок в массиве наоборот
     * @param array массив
     * @return массив
     */
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
           int temp = array[index];
            array[index] = array[array.length - (index + 1)];
            array[array.length - (index + 1)] = temp;
        }
        return array;
    }
}

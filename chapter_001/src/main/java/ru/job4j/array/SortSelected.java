package ru.job4j.array;

/**
 * class SortSelected сортировка массива по возрастанию
 * @author bespalov
 * @version 1.0
 */
public class SortSelected {

    /**
     * @param data массив
     * @return масив отсортированный по порядку
     */
    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length; index++) {
            int min = MinDiapason.findMin(data, index, data.length);
            int indexMin = FindLoop.indexOf(data, min, 0, data.length);
            SwitchArray.swap(data, index, indexMin);
        }
        return data;
    }
}

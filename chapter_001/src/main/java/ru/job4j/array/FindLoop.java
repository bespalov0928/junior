package ru.job4j.array;

/**
 * class FindLoop поиск в массиве
 * @author bespalov
 */
public class FindLoop {

    /**
     * поиск элемента в массиве
     * @param data входно массив
     * @param el елемент для поиска
     * @return
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * поиск элеента в массива в конкретном диапазоне
     * @param data - массив чисел
     * @param el - элемент, который нужно найти
     * @param start -  индекс, с которого начинаем поиск,
     * @param finish - индекс, которым заканчиваем поиск
     * @return результат
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index < finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

}

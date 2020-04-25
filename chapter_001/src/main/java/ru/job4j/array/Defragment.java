package ru.job4j.array;

/**
 * class Defragment перемещает заполненные ячейки массива в начало, а пустые в конец.
 * @author bespalov
 */
public class Defragment {
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }

    /**
     * перемещеине заполненных ячеек масива в начало
     * @param array массив
     * @return обработанный масив
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                while (point < array.length && array[point] == null) {
                    point++;
                }
                if (point >= array.length) {
                    break;
                }
                array[index] = array[point];
                array[point] = null;
            }
            System.out.println(array[index] + " ");
        }
        return array;
    }
}

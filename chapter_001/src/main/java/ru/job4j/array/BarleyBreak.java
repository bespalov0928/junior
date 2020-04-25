package ru.job4j.array;

/**
 * class BarleyBreak создание и обход двухмерного массива
 * @author bespalov
 */
public class BarleyBreak {
    public static void main(String[] args) {
        int value = 0;
        int[][] array = new int[3][3];
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                array[x][y] = ++value;
            }
        }
    }
}

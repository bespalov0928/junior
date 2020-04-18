package ru.job4j.array;

/**
 * class Matrix строит таблицу умножения
 * @author bespalov
 * @version 1.0
 */
public class Matrix {

    /**
     *
     * @param size размер таблицы
     * @return
     */
    public static int[][] multiple(int size) {
        int[][] table  = new int[size][size];
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                table[x][y] = (x + 1) * (y + 1);
            }
        }
        return table;
    }
}

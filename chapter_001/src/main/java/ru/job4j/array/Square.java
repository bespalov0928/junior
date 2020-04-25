package ru.job4j.array;

/**
 * class Square создание и обработка квадратного массива
 * @author bespalov
 */
public class Square {
    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    /**
     * создание массива calculate
     * @param bound размер массива
     * @return массив
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < rst.length; index++) {
            rst[index] = (int) Math.pow(index, 2);
        }
        return rst;
    }
}

package ru.job4j.array;

/**
 * class Check проверяет однородность массива
 * @author bespalov
 * @version 1/0
 */
public class Check {
    /**
     *
     * @param data исходный массив
     * @return результат проверки
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 1; index < data.length; index++) {
            if (data[0] != data[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

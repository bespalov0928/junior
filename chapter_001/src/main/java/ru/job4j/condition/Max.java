package ru.job4j.condition;

/**
 * class Max возвращает максимально число
 * @author bespalov
 */
public class Max {

    /**
     * возвращает максимально число из двух
     * @param left левое число
     * @param right правое число
     * @return
     */
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
}

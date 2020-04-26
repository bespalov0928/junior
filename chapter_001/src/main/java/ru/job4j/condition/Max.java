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

    /**
     * возвращает максимально число из трех
     * @param first
     * @param second
     * @param third
     * @return
     */
    public static int max(int first, int second, int third) {
        int tmp = max(first, second);
        int result = third > tmp ? third : tmp;
        return result;
    }

    /**
     * возвращает максимально число из четырех
     * @param first
     * @param second
     * @param third
     * @param four
     * @return
     */
    public static int max(int first, int second, int third, int four) {
        int tmp = max(first, second, third);
        int result = tmp > four ? tmp : four;
        return result;
    }
}

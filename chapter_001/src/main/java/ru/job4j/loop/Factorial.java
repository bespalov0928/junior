package ru.job4j.loop;

/**
 * class Factorial вычисляет факториал
 * @author bespalov
 */
public class Factorial {

    /**
     * вычисляет факториал
     * @param n положительное число
     * @return
     */
    public static int calc(int n) {
        int result = 1;
        for (int index = 1; index <= n; index++) {
            result *= index;
        }
        return result;
    }
}

package ru.job4j.condition;

/**
 * class ThreeMax возвращает максимальное число
 * @author bespalov
 */
public class ThreeMax {

    /**
     * возвращает максимальное число из трез
     * @param first первое число
     * @param second второе число
     * @param third третье число
     * @return
     */
    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first >= third) {
            result = first;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }
}

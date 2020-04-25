package ru.job4j.condition;

/**
 * class MultiMax возвращет максимальное число
 * @author bespalov
 */
public class MultiMax {

    /**
     * возвращает максимально число из трез
     * @param first первое число
     * @param second второе число
     * @param third третье число
     * @return
     */
    public int max(int first, int second, int third) {

        int result = first > second ? first : second;
        if (third > result) {
            result = third;
        }
        return result;
    }
}

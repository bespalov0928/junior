package ru.job4j.condition;

/**
 * class SqArea вычисляет площадь прямоуголника
 * @author bespalov
 */
public class SqArea {

    public static void main(String[] args) {
        double result;
        result = square(6, 2);
        System.out.println(" p = 6, k = 2 result = " + result);
        result = square(4, 1);
        System.out.println(" p = 4, k = 1 result = " + result);
    }

    /**
     * вычисляет площадь прямоуголника
     * @param p периметр
     * @param k коэффициент
     * @return
     */
    public static double square(int p, int k) {
        //double rsl = -1;
        double h;
        double l;
        double s;
        h = p / (2 * (k + 1));
        l = h * k;
        s = l * h;
        return s;
    }
}

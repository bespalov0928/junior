package ru.job4j.condition;


/**
 * class Point строит линию
 * @author bespalov
 */
public class Point {

    public static void main(String[] args) {
        double result;
        result = distance(0, 0, 2, 0);
        System.out.println("distance(0,0,2,0) " + result);
        result = distance(0, 0, 3, 0);
        System.out.println("distance(0, 0, 3, 0) " + result);
        result = distance(0, 0, 4, 0);
        System.out.println("distance(0, 0, 4, 0) " + result);
    }

    /**
     * возвращет квадратный корень между точками
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl;
        double x = x2 - x1;
        double y = y2 - y1;
        x = Math.pow(x, 2);
        y = Math.pow(y, 2);
        rsl = Math.sqrt(x + y);
        return rsl;
    }
}

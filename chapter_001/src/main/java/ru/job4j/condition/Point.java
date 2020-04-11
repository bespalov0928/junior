package ru.job4j.condition;

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

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl;
        double x = x2 - x1;
        double y = y2 - y1;

        x = x * x;
        y = y * y;

        rsl = Math.pow(x + y, 2);
        return rsl;
    }
}

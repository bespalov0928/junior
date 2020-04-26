package ru.job4j.condition;


import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * class Point строит линию
 *
 * @author bespalov
 */
public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public static void main(String[] args) {
        double result;

        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }

    /**
     * вычисление растояния между точками
     *
     * @param that объект точка
     * @return расстояние
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * вычисление растояния между точками в трех мерном пространстве
     * @param that
     * @return
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }
}

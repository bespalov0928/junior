package ru.job4j.condition;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class PointTest {
    @Test

    public void distance() {

        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

//    public void distance() {
//        int x1 = 0;
//        int x2 = 0;
//        int x3 = 2;
//        int x4 = 0;
//        double expected = 2;
//        double out = Point.distance(x1, x2, x3, x4);
//        Assert.assertEquals(expected, out, 0.01);
//    }
}

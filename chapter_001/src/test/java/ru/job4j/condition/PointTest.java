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

    @Test
    public void distance3d() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 2, 4);
        double expected = 4.47;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}

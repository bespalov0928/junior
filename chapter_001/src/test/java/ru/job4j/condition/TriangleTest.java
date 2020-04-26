package ru.job4j.condition;


import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class TriangleTest {

    @Test
    public void whenExist() {
        boolean result = Triangle.exit(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenExistFalse() {
        boolean result = Triangle.exit(2.0, 2.0, 5.0);
        assertThat(result, is(false));
    }

    @Test
    public void periodTrue() {
        Point first = new Point(5, 1);
        Point second = new Point(1, 5);
        Point third = new Point(5, 5);

        double ab = 2;
        double ac = 3;
        double bc = 4;

        double p;
        double expected = 4.5;
        Triangle trg = new Triangle(first, second, third);
        p = trg.period(ab, ac, bc);
        Assert.assertEquals(expected, p, 0.01);
    }



    @Test
    public void area() {
        Point first = new Point(5, 1);
        Point second = new Point(4, 2);
        Point third = new Point(5, 2);

        double s;
        double expected = 0.38;
        Triangle trg = new Triangle(first, second, third);
        s = trg.area();
        Assert.assertEquals(expected, s, 0.01);

    }
}

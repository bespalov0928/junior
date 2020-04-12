package ru.job4j.calculator;


import org.junit.Assert;
import org.junit.Test;


public class FitTest {


    @Test
    public void when180ManThen92Weight() {
        double in = 180;
        double expected = 92;
        double out = Fit.manWeight(180);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when180WomanThen80Weight() {
        double in = 180;
        double expected = 80.5;
        double out = Fit.womanWeight(180);
        Assert.assertEquals(expected, out, 0.01);
    }
}

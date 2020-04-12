package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;


public class ConverterTest {


    @Test
    public void whenRubleToThenEuro() {
        int in = 140;
        int expected = 2;
        int out = (int) Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenRubleToThenDollar() {
        int in = 180;
        int expected = 3;
        int out = (int) Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}

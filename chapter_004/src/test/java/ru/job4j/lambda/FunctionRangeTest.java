package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.lang.Math.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class FunctionRangeTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = Functions.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenQuadraticResults() {
        List<Double> result = Functions.diapason(4, 5, x -> sqrt(x));
        List<Double> expected = Arrays.asList(2.0D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenIndicatcResults() {
        List<Double> result = Functions.diapason(5, 8, x -> pow(2.0, x));
        List<Double> expected = Arrays.asList(32D, 64D, 128D);
        assertThat(result, is(expected));
    }
}

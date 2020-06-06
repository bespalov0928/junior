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
        List<Double> result = Functions.diapason(5, 8, x -> sqrt(x));
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenIndicatcResults() {
        List<Double> result = Functions.diapason(5, 8, x -> pow(x, 2.0));
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        assertThat(result, is(expected));
    }
}

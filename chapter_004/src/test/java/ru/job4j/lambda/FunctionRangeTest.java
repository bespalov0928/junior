package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FunctionRangeTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        var result = Functions.diapason(5, 8, x -> 2 * x + 1);
        var expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenQuadraticResults() {
        var result = Functions.diapason(4, 5, x -> sqrt(x));
        var expected = Arrays.asList(2.0D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenIndicatcResults() {
        var result = Functions.diapason(5, 8, x -> pow(2.0, x));
        var expected = Arrays.asList(32D, 64D, 128D);
        assertThat(result, is(expected));
    }
}

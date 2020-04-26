package ru.job4j.condition;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To1Then1() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

   @Test
    public void whenEquals() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }


    @Test
    public void maxThird() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    /** @noinspection checkstyle:MethodName*/
    @Test
    public void maxOneOneThirdThird() {
        int result = Max.max(1, 1, 3);
        assertThat(result, is(3));
    }

    @Test
    public void maxFour() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
    @Test
    public void maxOneTwoTwoFourFour() {
        int result = Max.max(1, 2, 2, 4);
        assertThat(result, is(4));
    }
}

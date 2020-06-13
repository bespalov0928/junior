package ru.job4j.collection;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class ConvertListTest {

    @Test
    public void whenTwoList() {
        var in = List.of(
                new int[]{1},
                new int[]{2, 3}
        );
        var expect = List.of(1, 2, 3);
        assertThat(ConvertList.convert(in), is(expect));
    }
}

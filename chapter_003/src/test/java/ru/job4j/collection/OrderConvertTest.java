package ru.job4j.collection;


import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class OrderConvertTest {

    @Test
    public void whenSingleOrder() {
        var orders = List.of(new Order("123", "Pfzdrf1"));
        var rsl = OrderConvert.process(orders);
        assertThat(rsl.get("123"), is(new Order("123", "Pfzdrf1")));
    }
}

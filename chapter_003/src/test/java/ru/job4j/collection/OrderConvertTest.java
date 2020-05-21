package ru.job4j.collection;


import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class OrderConvertTest {

    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("123", "Pfzdrf1"));
        HashMap<String, Order> rsl = OrderConvert.process(orders);
        assertThat(rsl.get("123"), is(new Order("123", "Pfzdrf1")));
    }
}

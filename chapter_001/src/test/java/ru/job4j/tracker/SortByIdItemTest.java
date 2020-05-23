package ru.job4j.tracker;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class SortByIdItemTest {

    @Test
    public void compare() {

        Item item1 = new Item("item1");
        Item item2 = new Item("item2");
        Item item3 = new Item("item3");
        item1.setId("1");
        item2.setId("2");
        item3.setId("3");
        List<Item> items = Arrays.asList(
                item3,
                item2,
                item1
        );
        Collections.sort(items, new SortByIdItem());
        List<Item> extend = Arrays.asList(
                item1,
                item2,
                item3
        );
        assertThat(items, is(extend));
    }
    @Test
    public void compareRevers() {

        Item item1 = new Item("item1");
        Item item2 = new Item("item2");
        Item item3 = new Item("item3");
        item1.setId("1");
        item2.setId("2");
        item3.setId("3");
        List<Item> items = Arrays.asList(
                item1,
                item2,
                item3
        );
        Collections.sort(items, new SortByIdItemRevers());
        List<Item> extend = Arrays.asList(
                item3,
                item2,
                item1
        );
        assertThat(items, is(extend));
    }
}

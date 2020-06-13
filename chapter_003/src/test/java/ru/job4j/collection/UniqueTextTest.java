package ru.job4j.collection;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class UniqueTextTest {

    @Test
    public void isEquals() {
        var origin = "My cat eats a mouse";
        var text = "My cat eats a mouse";
        assertThat(UniqueText.isEquals(origin, text), is(true));
    }

    @Test
    public void isNotEquals() {
        var origin = "My cat eats a mouse";
        var text = "A mouse is eaten by a cat";
        assertThat(UniqueText.isEquals(origin, text), is(false));
    }
}

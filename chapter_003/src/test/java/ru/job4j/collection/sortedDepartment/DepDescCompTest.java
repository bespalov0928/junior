package ru.job4j.collection.sortedDepartment;


import org.junit.Test;


import static org.hamcrest.number.OrderingComparison.*;
import static org.junit.Assert.*;


public class DepDescCompTest {

    @Test
    public void compare() {
        var rsl = new DepDescComp().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenUpDepartmentGoBefore() {
        var rsl = new DepDescComp().compare(
                "K2",
                "K2/SK1"
        );
        assertThat(rsl, lessThan(0));
    }
}

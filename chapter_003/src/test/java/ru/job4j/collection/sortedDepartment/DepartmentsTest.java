package ru.job4j.collection.sortedDepartment;


import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class DepartmentsTest {

    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenReversedSortOne() {
        List<String> input = Arrays.asList("k1", "k1/sk1", "k2", "k2/sk1");
        List<String> expect = Arrays.asList("k2", "k2/sk1", "k1", "k1/sk1");
        Collections.sort(input, new DepDescComp());
        //List<String> result = Departments.fillGaps(input);
        assertThat(input, is(expect));
    }

    @Test
    public void whenReversedSortTwo() {
        List<String> input = Arrays.asList("k1", "k1/sk1", "k2", "k2/sk1", "k2/sk1/ssk1", "k2/sk1/ssk1/ssk2");
        List<String> expect = Arrays.asList("k2", "k2/sk1", "k2/sk1/ssk1", "k2/sk1/ssk1/ssk2", "k1", "k1/sk1");
        Collections.sort(input, new DepDescComp());
        //List<String> result = Departments.fillGaps(input);
        assertThat(input, is(expect));
    }


}

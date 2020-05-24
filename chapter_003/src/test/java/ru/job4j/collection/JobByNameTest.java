package ru.job4j.collection;


import org.junit.Test;


import java.util.Comparator;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;


public class JobByNameTest {

    @Test
    public void compareWhenFirstLessSecond() {
        Comparator<Job> byName = new JobByName();
        int rsl = byName.compare(
                new Job("Task1", 2),
                new Job("Task2", 1));
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void compareWhenFirstMoreSecond() {
        Comparator<Job> byName = new JobByName();
        int rsl = byName.compare(
                new Job("Task2", 2),
                new Job("Task1", 1));
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void compareWhenFirstEqvalsSecond() {
        Comparator<Job> byName = new JobDescByName();
        int rsl = byName.compare(
                new Job("Task1", 2),
                new Job("Task1", 1));
        assertThat(rsl, equalTo(0));
    }
}

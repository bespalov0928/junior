package ru.job4j.collection;


import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;


public class JobDescByPriorityTest {

    @Test
    public void whenFirstMoreSecond() {
        Comparator<Job> prioritetJob = new JobDescByPriority();
        int rsl = prioritetJob.compare(
                new Job("Task1", 2),
                new Job("Task2", 1)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenFirstLessSecond() {
        Comparator<Job> prioritetJob = new JobDescByPriority();
        int rsl = prioritetJob.compare(
                new Job("Task1", 1),
                new Job("Task2", 2)
        );
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenFirstEqualsSecond() {
        Comparator<Job> prioritetJob = new JobDescByPriority();
        int rsl = prioritetJob.compare(
                new Job("Task1", 1),
                new Job("Task2", 1)
        );
        assertThat(rsl, equalTo(0));
    }

}

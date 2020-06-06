package ru.job4j.collection;


import org.junit.Test;
import ru.job4j.collection.sortedJobs.Job;
import ru.job4j.collection.sortedJobs.JobDescByName;

import java.util.Comparator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;


public class JobDescByNameTest {

    @Test
    public void compareWhenFirstLessSecond() {
        Comparator<Job> byName = new JobDescByName();
        int rsl = byName.compare(
                new Job("Task1", 2),
                new Job("Task2", 1));
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void compareWhenFirstMoreSecond() {
        Comparator<Job> byName = new JobDescByName();
        int rsl = byName.compare(
                new Job("Task2", 2),
                new Job("Task1", 1));
        assertThat(rsl, lessThan(0));
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

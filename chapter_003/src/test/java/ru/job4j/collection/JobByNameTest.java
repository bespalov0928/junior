package ru.job4j.collection;


import org.junit.Test;
import ru.job4j.collection.sortedJobs.Job;
import ru.job4j.collection.sortedJobs.JobByName;
import ru.job4j.collection.sortedJobs.JobDescByName;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;


public class JobByNameTest {

    @Test
    public void compareWhenFirstLessSecond() {
        var byName = new JobByName();
        var rsl = byName.compare(
                new Job("Task1", 2),
                new Job("Task2", 1));
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void compareWhenFirstMoreSecond() {
        var byName = new JobByName();
        var rsl = byName.compare(
                new Job("Task2", 2),
                new Job("Task1", 1));
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void compareWhenFirstEqvalsSecond() {
        var byName = new JobDescByName();
        var rsl = byName.compare(
                new Job("Task1", 2),
                new Job("Task1", 1));
        assertThat(rsl, equalTo(0));
    }
}

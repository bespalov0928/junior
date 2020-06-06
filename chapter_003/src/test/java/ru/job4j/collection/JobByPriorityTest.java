package ru.job4j.collection;


import org.junit.Test;
import ru.job4j.collection.sortedJobs.Job;
import ru.job4j.collection.sortedJobs.JobByPriority;

import java.util.Comparator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;


public class JobByPriorityTest {

    @Test
    public void whenFirstMoreSecond() {
        Comparator<Job> prioritetJob = new JobByPriority();
        int rsl = prioritetJob.compare(
                new Job("Task1", 2),
                new Job("Task2", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenFirstLessSecond() {
        Comparator<Job> prioritetJob = new JobByPriority();
        int rsl = prioritetJob.compare(
                new Job("Task1", 1),
                new Job("Task2", 2)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenFirstEqualsSecond() {
        Comparator<Job> prioritetJob = new JobByPriority();
        int rsl = prioritetJob.compare(
                new Job("Task1", 1),
                new Job("Task2", 1)
        );
        assertThat(rsl, equalTo(0));
    }
}

package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.collection.sortedJobs.*;

import java.util.Comparator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;


public class JobTest {

    @Test
    public void whenCompatorByDescNameByDescPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("P", 0),
                new Job("I", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameByDescPrority() {
        Comparator<Job> cmpNamePriority = new JobByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("P", 0),
                new Job("I", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByDeskNameByPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("P", 0),
                new Job("P", 1)
        );
        assertThat(rsl, lessThan(0));
    }


}

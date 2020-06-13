package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.collection.sortedJobs.*;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;


public class JobTest {

    @Test
    public void whenCompatorByDescNameByDescPrority() {
        var cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        var rsl = cmpNamePriority.compare(
                new Job("P", 0),
                new Job("I", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameByDescPrority() {
        var cmpNamePriority = new JobByName().thenComparing(new JobDescByPriority());
        var rsl = cmpNamePriority.compare(
                new Job("P", 0),
                new Job("I", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByDeskNameByPrority() {
        var cmpNamePriority = new JobDescByName().thenComparing(new JobByPriority());
        var rsl = cmpNamePriority.compare(
                new Job("P", 0),
                new Job("P", 1)
        );
        assertThat(rsl, lessThan(0));
    }


}

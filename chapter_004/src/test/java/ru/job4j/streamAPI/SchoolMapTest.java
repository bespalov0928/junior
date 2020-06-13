package ru.job4j.streamAPI;


import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class SchoolMapTest {

    @Test
    public void collect() {
        var students = List.of(
                new Student(40, "Ivan"),
                new Student(45, "Ivan"),
                new Student(50, "Petr"),
                new Student(60, "Nikolay")
        );
        var result = SchoolMap.collect(students);

        var expected = new HashMap<String, Student>();
        expected.put("Ivan", new Student(40, "Ivan"));
        expected.put("Petr", new Student(50, "Petr"));
        expected.put("Nikolay", new Student(60, "Nikolay"));

        assertThat(result, is(expected));


    }
}

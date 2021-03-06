package ru.job4j.streamAPI;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class SchoolTest {


    @Test
    public void collectA() {
        var students = List.of(
                new Student(40, "Ivan"),
                new Student(50, "Petr"),
                new Student(60, "Nikolay"),
                new Student(70, "Mikhail"),
                new Student(80, "Olga"),
                new Student(90, "Marina"),
                new Student(100, "Masha")
        );
        var result = School.collect(students,
                (student) -> {
                    System.out.println(student.toString());
                    return (student.getScope() >= 70) & (student.getScope() <= 100);
                }
        );
        var expected = List.of(
                new Student(70, "Mikhail"),
                new Student(80, "Olga"),
                new Student(90, "Marina"),
                new Student(100, "Masha")
        );

        assertThat(result, is(expected));
    }

    @Test
    public void collectB() {
        var students = List.of(
                new Student(40, "Ivan"),
                new Student(50, "Petr"),
                new Student(60, "Nikolay"),
                new Student(70, "Mikhail"),
                new Student(80, "Olga"),
                new Student(90, "Marina"),
                new Student(100, "Masha")
        );
        var result = School.collect(students,
                (student) -> {
                    System.out.println(student.toString());
                    return (student.getScope() >= 50) & (student.getScope() < 70);
                }
        );
        var expected = List.of(
                new Student(50, "Petr"),
                new Student(60, "Nikolay")
                );

        assertThat(result, is(expected));
    }

    @Test
    public void collectC() {
        var students = List.of(
                new Student(40, "Ivan"),
                new Student(50, "Petr"),
                new Student(60, "Nikolay"),
                new Student(70, "Mikhail"),
                new Student(80, "Olga"),
                new Student(90, "Marina"),
                new Student(100, "Masha")
        );
        var result = School.collect(students,
                (student) -> {
                    System.out.println(student.toString());
                    return (student.getScope() > 0) & (student.getScope() < 50);
                }
        );
        var expected = List.of(
                new Student(40, "Ivan")
        );

        assertThat(result, is(expected));
    }
}

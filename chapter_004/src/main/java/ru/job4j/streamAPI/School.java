package ru.job4j.streamAPI;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public static List<Student> collect(List<Student> students, Predicate<Student> predicate) {
        List<Student> rsl = students.stream().filter(
                student -> {
                    return predicate.test(student);
                }
        ).collect(Collectors.toList());
        return rsl;
    }
}

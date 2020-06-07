package ru.job4j.streamAPI;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public static List<Student> collect(List<Student> students, Predicate<Student> predicate) {

        Predicate<Student> predicat = (student) -> (predicate.test(student));

        List<Student> rsl = students
                .stream()
                .filter(predicat)
                .collect(Collectors.toList());
        return rsl;
    }
}

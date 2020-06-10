package ru.job4j.streamAPI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SchoolMap {
    public static Map<String, Student> collect(List<Student> students) {

        return students.stream().collect(Collectors.toMap(
                student -> student.getSurname(),
                student -> student,
                (first, second) -> first
        ));
    }
}

package ru.job4j.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {

    public static List<Integer> convertInStrem(Integer[][] array) {
        return Stream.of(array)
                .flatMap(e -> Arrays.stream(e))
                .collect(Collectors.toList());
    }
}

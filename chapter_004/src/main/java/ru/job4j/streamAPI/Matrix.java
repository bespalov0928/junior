package ru.job4j.streamAPI;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {
    public static void main(String[] args) {
//        List<List<Integer>> matrix = List.of(
//                List.of(1, 2),
//                List.of(3, 4)
//        );
//
//        System.out.println(matrix.stream().flatMap(e -> e.stream())
//                .collect(Collectors.toList()));

        Integer[][] array = new Integer[2][2];
        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;
        Stream<Integer[]> matrix =  Stream.of(array);
        System.out.println(matrix.flatMap(e -> Arrays.stream(e))
                .collect(Collectors.toList()));
    }
}

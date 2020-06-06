package ru.job4j.lambda;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Reduce {
    public static int summation(int to) {
        BiFunction<Integer, Integer, Integer> func = (left, right) -> (left + right);
        Supplier<Integer> initValue = () -> (0);
        return loop(to, func, initValue);
    }

    public static int multiplication(int to) {
        BiFunction<Integer, Integer, Integer> func = (left, right) -> (left * right);
        Supplier<Integer> initValue = () -> 1;
        return loop(to, func, initValue);
    }

    public static void main(String[] args) {
        System.out.println(summation(3));
        System.out.println(multiplication(3));
    }

    private static int loop(int to, BiFunction<Integer, Integer, Integer> func, Supplier<Integer> initValue) {
        int rsl = initValue.get();
        for (int index = rsl; index < to; index++) {
            rsl = func.apply(rsl, index);
        }
        return rsl;
    }

}

package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Block {
    private static Comparator<? super String> cmpText;

    public static void main(String[] args) {

        Comparator<String> cmpText = new Comparator<String>() {
            @Override
            public int compare(String left, String right) {
                System.out.println(String.format("compare right:%s, left:%s", right, left));
                return left.compareTo(right);
            }
        };
        String[] numbers = {"1", "10", "111", "1234"};
        Arrays.sort(numbers, cmpText);

        System.out.println();

        Comparator<String> cmpDescSize = new Comparator<String>() {
            @Override
            public int compare(String left, String right) {
                System.out.println(String.format("compare right.lehgth:%s, left.length:%s", right.length(), left.length()));
                return Integer.compare(right.length(), left.length());
            }
        };
        Arrays.sort(numbers, cmpDescSize);
    }


}

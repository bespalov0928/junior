package ru.job4j.stragery;

import java.util.StringJoiner;

public class Square implements Shape {
    public String draw() {
        StringJoiner sj = new StringJoiner(System.lineSeparator())
                .add("++++")
                .add("+  +")
                .add("+  +")
                .add("++++");

        return sj.toString();
    }
}

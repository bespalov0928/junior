package ru.job4j.stragery;

import java.util.StringJoiner;

public class Triangle implements Shape {
    public String draw() {
        StringJoiner sj = new StringJoiner(System.lineSeparator())
                .add("  +  ")
                .add(" +++ ")
                .add("+++++");
        return sj.toString();
    }
}

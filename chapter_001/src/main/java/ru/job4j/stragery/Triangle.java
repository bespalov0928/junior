package ru.job4j.stragery;

public class Triangle implements Shape {
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("  +  ").append(System.lineSeparator());
        sb.append(" +++ ").append(System.lineSeparator());
        sb.append("+++++").append(System.lineSeparator());
        return sb.toString();
    }
}

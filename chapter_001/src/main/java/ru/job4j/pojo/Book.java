package ru.job4j.pojo;

public class Book {
    private String name;
    private int count;

    public Book(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    private void setCount(int count) {
        this.count = count;
    }
}

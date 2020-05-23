package ru.job4j.collection;

public class Job implements Comparable<Job> {
    private String name;
    private int prioritet;

    public Job(String name, int prioritet) {
        this.name = name;
        this.prioritet = prioritet;
    }

    public String getName() {
        return name;
    }

    public int getPrioritet() {
        return prioritet;
    }

    @Override
    public String toString() {
        String rsl = String.format("Job{name='%s', priority='%s'}", name, prioritet);
        return rsl;
    }

    @Override
    public int compareTo(Job another) {
        int rsl = Integer.compare(prioritet, another.prioritet);
        return rsl;
    }

}
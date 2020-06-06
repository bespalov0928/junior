package ru.job4j.collection.sortedJobs;

import ru.job4j.collection.sortedJobs.Job;

import java.util.Comparator;

public class JobByPriority implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return Integer.compare(first.getPrioritet(), second.getPrioritet());
    }
}

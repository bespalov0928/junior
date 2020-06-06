package ru.job4j.collection.sortedJobs;

import ru.job4j.collection.sortedJobs.Job;

import java.util.Comparator;

public class JobDescByPriority implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return Integer.compare(second.getPrioritet(), first.getPrioritet());
    }
}

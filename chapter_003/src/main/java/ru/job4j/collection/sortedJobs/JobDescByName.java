package ru.job4j.collection.sortedJobs;

import ru.job4j.collection.sortedJobs.Job;

import java.util.Comparator;

public class JobDescByName implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return second.getName().compareTo(first.getName());
    }
}

package ru.job4j.collection.sortedJobs;

import ru.job4j.collection.sortedJobs.Job;

import java.util.Comparator;

public class JobByName implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return first.getName().compareTo(second.getName());
    }
}

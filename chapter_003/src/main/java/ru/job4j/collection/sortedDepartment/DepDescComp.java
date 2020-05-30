package ru.job4j.collection.sortedDepartment;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String first, String second) {

        String[] firstArr = first.split("/");
        String[] secondArr = second.split("/");
        int rsl = secondArr[0].compareTo(firstArr[0]);

        return rsl == 0 ? first.compareTo(second) : rsl;
    }
}

package ru.job4j.collection.sortedDepartment;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {

        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.equals("")) {
                    start = el;
                } else {
                    start = start + "/" + el;
                }
                tmp.add(start);
            }
        }
        List<String> rsl = new ArrayList<>(tmp);
        sortAsc(rsl);

        return rsl;
    }

    public static void sortAsc(List<String> orsg) {
        Collections.sort(orsg, Comparator.naturalOrder());
    }

    public static void sotrDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }
}

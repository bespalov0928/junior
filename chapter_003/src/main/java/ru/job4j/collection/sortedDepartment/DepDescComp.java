package ru.job4j.collection.sortedDepartment;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        int rsl = 0;
        String[] firstArr = first.split("/");
        String[] secondArr = second.split("/");
        if (firstArr.length != secondArr.length) {
            rsl = secondArr[0].compareTo(firstArr[0]);
        } else {
            rsl = secondArr[0].compareTo(firstArr[0]);
            if (rsl == 0) {
                for (int index = 1; index < firstArr.length; index++) {
                    rsl = firstArr[index].compareTo(secondArr[index]);
                }
            }
        }
        return rsl;
    }
}

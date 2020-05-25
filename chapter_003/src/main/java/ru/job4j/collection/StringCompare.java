package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String first, String second) {
        char[] arrayFirst = first.toCharArray();
        char[] arraySecond = second.toCharArray();
        int rsl = Integer.compare(arrayFirst.length, arraySecond.length);
            int indexMin = Math.min(arrayFirst.length, arraySecond.length);
            for (int index = 0; index < indexMin; index++) {
                int rslTemp = Character.compare(arrayFirst[index], arraySecond[index]);
                if (rslTemp != 0) {
                    rsl = rslTemp;
                    break;
                }
            }
        return rsl;
    }
}

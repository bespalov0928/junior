package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String first, String second) {
        int rsl = 0;
        char[] arrayFirst = first.toCharArray();
        char[] arraySecond = second.toCharArray();
        int indexMin = arrayFirst.length < arraySecond.length ? arrayFirst.length : arraySecond.length;

            //int maxLength = arrayFirst.length >= arraySecond.length ? arrayFirst.length : arraySecond.length;
            for (int index = 0; index < indexMin; index++) {
                rsl = Character.compare(arrayFirst[index], arraySecond[index]);
                if (rsl == 0) {
                    continue;
                }
                break;
            }


        if (rsl == 0 && arrayFirst.length != arraySecond.length) {
            rsl = Integer.compare(arrayFirst.length, arraySecond.length);
        }
        return rsl;
    }
}

package ru.job4j.sort;

import java.util.Arrays;

import static java.lang.Math.*;

/**
 * class Merge объединяет два массива
 */

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int l = 0;
        int r = 0;
        int index = 0;

        while (index < min(left.length, right.length) * 2) {
            if (l >= left.length || r >= right.length) {
                break;
            }
            if (left[l] < right[r]) {
                rsl[index] = left[l];
                l++;
            } else if (right[r] < left[l]) {
                rsl[index] = right[r];
                r++;
            } else if (right[r] == left[l]) {
                rsl[index] = right[r];
                rsl[++index] = left[l];
                l++;
                r++;
            }
            index++;
        }

        if (l < left.length) {
            while (l < left.length) {
                rsl[index] = left[l];
                l++;
                index++;
            }
        } else if (r < right.length) {
            while (r < right.length) {
                rsl[index] = right[r];
                r++;
                index++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }

}

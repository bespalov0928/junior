package ru.job4j.loop;

/**
 * class PrimeNumber вычисляет количество простых чисел от 1 до X включительно
 * @author bespalov
 */
public class PrimeNumber {

    /**
     * вычисляет количество простых чисел от 1 до X включительно
     * @param finish
     * @return
     */
    public int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
               count++;
            }
        }
        return count;
    }
}

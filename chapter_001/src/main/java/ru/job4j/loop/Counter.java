package ru.job4j.loop;

/**
 * class Counter подсчитываtn сумму чисел от начального значения до конечного
 * @author bespalov
 */
public class Counter {
    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }

    /**
     * подсчитываtn сумму чисел от начального значения до конечного
     * @param start число
     * @param finish число
     * @return сумма
     */
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            sum += index;
        }
        return sum;
    }

    /**
     * вычисляет сумму четныx чисел в диапазоне от start до finish
     * @param start число
     * @param finish число
     * @return сумма
     */
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            sum += index % 2 == 0 ? index : 0;
        }
        return sum;
    }
}

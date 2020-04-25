package ru.job4j.loop;

/**
 * class CheckPrimeNumber Метод должен вернуть true, если переменная number является простым числом.
 * @author bespalov
 */
public class CheckPrimeNumber {

    /**
     * Метод должен вернуть true, если переменная number является простым числом.
     * @param number число
     * @return результат
     */
    public static boolean check(int number) {
        boolean prime = number > 1;

        for (int index = 2; index < number; index++) {
            if ((number % index) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}

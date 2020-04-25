package ru.job4j.loop;

/**
 * class Mortgage количество лет, необходимых для погашения кредита.
 * @author bespalov
 */
public class Mortgage {
    /**
     * количество лет, необходимых для погашения кредита.
     * @param amount сумма выданная по кредиту,
     * @param salary годовой доход
     * @param percent процентная ставка по кредиту
     * @return
     */
    public int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount =  (int) (amount * (percent / 100 + 1) - salary);
            year++;
        }
        return year;
    }
}


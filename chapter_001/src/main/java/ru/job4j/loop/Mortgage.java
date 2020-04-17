package ru.job4j.loop;

public class Mortgage {

    //amount  - сумма выданная по кредиту,
    //salary  - годовой доход,
    //percent - процентная ставка по кредиту
    public int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount =  (int) (amount * (percent / 100 + 1) - salary);
            year++;
        }
        return year;
    }

}


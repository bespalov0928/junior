package ru.job4j.loop;

/**
 * class Fitness количество месяцев, которое необходимо Ивану, чтобы обогнать в тяге Николая
 * @author bespalov
 */
public class Fitness {

    /**
     * количество месяцев, которое необходимо Ивану, чтобы обогнать в тяге Николая
     * @param ivan тяга кг
     * @param nik тяга кг
     * @return количество месяцев
     */
    public static int calc(int ivan, int nik) {
        int month = 0;

        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}

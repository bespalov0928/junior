package ru.job4j.oop;

/**
 * class Battery действия с аккумулятором
 * @author bespalov
 */
public class Battery {
    private int load;

    /**
     * перекидывам заряд на другой аккум
     * @param another аккумулятор
     */
    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }
}

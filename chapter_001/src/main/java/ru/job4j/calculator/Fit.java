package ru.job4j.calculator;

/**
 * class Fit вычисление оптимальной масы тела
 * @author bespalov
 */
public class Fit {
    public static void main(String[] args) {
        double man = Fit.manWeight(180);
        double woman = Fit.womanWeight(180);
        System.out.println("Man 180 is " + man);
        System.out.println("Woman 180 is " + woman);
    }

    /**
     * вычисляет массу тела мужчины
     * @param height рос
     * @return масса
     */
    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    /**
     * вычисляет массу тла женщины
     * @param height рост
     * @return масса
     */
    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }
}

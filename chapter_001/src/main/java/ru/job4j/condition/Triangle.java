package ru.job4j.condition;


/**
 * class Triangle проверка на существование треуголника
 */
public class Triangle {

    /**
     * сумма двух сторон должна быть бльше третьей
     * @param ab сторона треугольника
     * @param ac сторона треугольника
     * @param bc сторона треугольника
     * @return
     */
    public static boolean exit(double ab, double ac, double bc) {
        return (ab + ac > bc) && (ac + bc > ab) && (bc + ab > ac);
    }
}

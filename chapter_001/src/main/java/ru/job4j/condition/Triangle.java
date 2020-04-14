package ru.job4j.condition;

public class Triangle {
    public static boolean exit(double ab, double ac, double bc) {

        boolean rsl = false;
        if ((ab + ac > bc) && (ac + bc > ab) && (bc + ab > ac)) {
            rsl = true;
        }
        return rsl;
    }
}

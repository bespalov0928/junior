package ru.job4j.condition;

public class Triangle {
    public static boolean exit(double ab, double ac, double bc) {


        return (ab + ac > bc) && (ac + bc > ab) && (bc + ab > ac);
    }
}

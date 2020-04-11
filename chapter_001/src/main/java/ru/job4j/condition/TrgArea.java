package ru.job4j.condition;

public class TrgArea {

    public static void main(String[] args) {
        double rsl = area(4, 4, 2);
        System.out.println("area (4, 4, 2) = " + rsl);
    }

    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double z = p * (p-a) * (p-b) * (p-c);
        double rsl = Math.sqrt(z);
        return rsl;
    }
}

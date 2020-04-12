package ru.job4j.converter;

public class Converter {

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        float dollar = rubleToDollar(140);

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");

        float in = 140;
        float expected = 2;
        float out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);


        in = 140;
        expected = (float) 2.3333333;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 2.3333333. Test result : " + passed);

    }

    public static float rubleToEuro(float value) {
        float rsl = (float) (value / 70);
        return rsl;
    }
    public static float rubleToDollar(float value) {
        float rsl = (float) (value / 60.00);
        return rsl;
    }

}

package ru.job4j.converter;

/**
 * 1.1.4.5.8. JavaDoc. Code convention[#270956]
 * class Converter - пересчитывает иностранную валюту в рубли
 * @author bespalov
 * @version 1.0
 */
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

    /**
     * конвертация рубля в евро
     * @param value - сумма в рублях
     * @return - возвращаем сумму в ЕВРО
     */
    public static float rubleToEuro(float value) {
        float rsl = (float) (value / 70);
        return rsl;
    }

    /**
     * конвертация рубля в доллар
     * @param value - сумма в рублях
     * @return - возвращаем сумму в долларах
     */
    public static float rubleToDollar(float value) {
        float rsl = (float) (value / 60.00);
        return rsl;
    }

}

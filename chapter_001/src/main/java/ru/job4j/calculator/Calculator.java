package ru.job4j.calculator;

/**
 * class Calculator функции калькулятора
 * @author
 */
public class Calculator {

    public static void main(String[] args) {
        Calculator.plus(1, 2);
        Calculator.plus(10, 11);
        int reult = Calculator.func1(100);
    }

    /**
     * сложение
     * @param first первое число
     * @param second второе число
     */
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    /**
     * возведеине в степень
     * @param x степень
     * @return
     */
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }
}

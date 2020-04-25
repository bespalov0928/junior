package ru.job4j.oop;

/**
 * class Jar действия с сосудом с водой
 * @author bespalov
 */
public class Jar {
    private int value;

    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        System.out.println("first : " + first.value + ". second : " + second.value);
        first.pour(second);
        System.out.println("first : " + first.value + ". second : " + second.value);
    }

    /**
     * объем сосуда
     * @param size
     */
    public Jar(int size) {
        this.value = size;
    }

    /**
     * переливние жидкости из одного сосуда в другой
     * @param another сосуд
     */
    public void pour(Jar another) {
        this.value = this.value + another.value;
        another.value = 0;
    }
}

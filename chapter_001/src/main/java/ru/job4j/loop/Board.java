package ru.job4j.loop;

/**
 * class Board выводит прямоугольник, заполненный символом 'X
 * @author bespalov
 */
public class Board {
    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(5, 4);

    }

    /**
     * выводит прямоугольник, заполненный символом 'X
     * @param width ширина достки
     * @param height длина доски
     */
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if ((row + cell) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}

package ru.job4j.io;

import java.util.Scanner;

/**
 * class Matches игра Спички
 *
 * @author bespalov
 */
public class Matches {
    public static void main(String[] args) {
        int count = 11;
        Scanner input = new Scanner(System.in);
        boolean run = true;
        boolean move = true;
        while (run) {
            System.out.println("Ходит " + (move ? "первый игрок." : "второй игрок."));
            int tmp = Integer.valueOf(input.nextLine());
            if (tmp > 3) {
                System.out.println("Количество спичек больше 3-х");
                continue;
            }
            count = count - tmp;

            System.out.println("Осталось " + count + "спичек.");
            if (count > 0) {
                move = !move;
                continue;
            } else {
                run = false;
            }

            if (move) {
                System.out.println("Выйграл первый игрок");
            } else {
                System.out.println("Выйграл второй игрок");
            }
        }
    }
}

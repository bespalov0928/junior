package ru.job4j.io;

import java.util.Scanner;

/**
 * class Matches игра Спички
 * @author bespalov
 */
public class Matches {
    public static void main(String[] args) {
        int count = 11;
        Scanner input = new Scanner(System.in);
        boolean run = true;
        boolean move = true;
        while (run) {
            System.out.println("Следующий ход.");
            int tmp = Integer.valueOf(input.nextLine());
            if (tmp > 3) {
                System.out.println("Количество спичек больше 3-х");
                continue;
            }
            count = count - tmp;
            if (count <= 3) {
                run = false;
            } else {
                continue;
            }

            if (move) {
                System.out.println("Выйграл первый игрок");
            } else {
                System.out.println("Выйграл второй игрок");
            }
        }
    }
}

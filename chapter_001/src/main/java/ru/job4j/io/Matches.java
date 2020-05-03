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
        int move = 1;
        while (run) {
            System.out.println("Следующий ход.");
            int tmp = Integer.valueOf(input.nextLine());
            if (tmp > 3) {
                System.out.println("Количество спичек больше 3-х");
                continue;
            }
            count = count - tmp;
            if (count <= 0) {
                run = false;
            } else {
                move++;
                continue;
            }

            if (move % 2 == 0) {
                System.out.println("Выйграл второй игрок");
            } else {
                System.out.println("Выйграл первый игрок");
            }
        }
    }
}

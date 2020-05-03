package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int answer;
        String qwestion = "";
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        while (!qwestion.equals("спасибо")) {
            answer = random.nextInt(3);
            qwestion = input.nextLine();
            if (answer == 0) {
                System.out.println("Да");
            } else if (answer == 1) {
                System.out.println("Нет");
            } else {
                System.out.println("Может быть.");
            }

        }
    }
}

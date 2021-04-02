package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Я великий Оракул. Что ты хочешь узнать?");
        System.out.print("Сформулируй вопрос так, чтобы я мог ответить только \"ДА\" или \"НЕТ\" ");
        Scanner in = new Scanner(System.in);
        in.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.print("Да");
        } else if (answer == 1) {
            System.out.print("Нет");
        } else {
            System.out.print("Может быть");
        }
    }
}

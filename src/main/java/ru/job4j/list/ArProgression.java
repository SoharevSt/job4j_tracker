package ru.job4j.list;

import java.util.List;

// * Необходимо реализовать метод, который определит является ли список чисел
// * арифметической прогрессией.
// * Если является - то метод должен вернуть сумму всех элементов, иначе - вернуть 0.

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int rsl = 0;
        for (int i = 1; i < data.size() - 1; i++) {
            if (data.get(i) != (data.get(i - 1) + data.get(i + 1)) / 2) {
                rsl = 0;
                break;
            } else {
                rsl += data.get(i);
            }
        }
        return rsl == 0 ? 0 : rsl + data.get(0) + data.get(data.size() - 1);
    }
}
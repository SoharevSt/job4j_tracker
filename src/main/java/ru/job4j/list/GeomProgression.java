package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

// * Необходимо реализовать метод, который генерирует геометрическую прогрессию
// * и при этом принимает 3 значения:
// 1. Первый элемент геометрической прогрессии;
// 2. Знаменатель прогрессии;
// 3. Количество элементов, которое должно содержаться в сгенерированной последовательности.
// При этом метод должен вернуть сумму элементов сгенерированной последовательности.

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> gp = new ArrayList<>(count);
        gp.add(first);
        for (int i = 1; i < count; i++) {
            gp.add(i, first * (int) Math.pow(denominator, i));
        }
        int sum = 0;
        for (Integer in : gp) {
            sum += in;
        }
        return sum;
    }
}
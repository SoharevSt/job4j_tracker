package ru.job4j.lambda;

import java.util.Optional;

/*
Иногда нужно при нахождении Optional выполнить какое-то действие.
Для этого существует метод ifPresent(), он принимает Consumer,
который будет выполнен, если значение Optional не пустое.
Optional.of(1).ifPresent(System.out::println); // выведется 1
Optional.empty().ifPresent(System.out::println); // ничего не выведется, потому что значения нет
Ваша задача:
1. Написать метод max(). Он находит максимальный элемент массива. Если массив пуст,
то возвращает пустой Optional, в противном случае Optional из максимального значения
2. Метод ifPresent() вызывает метод max(). Если значение существует,
то выводит максимальное значение
например, "Max: 3". Для вывода нужно использовать System.out.println()
 */

public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
        max(data).ifPresent(s -> System.out.println("Max: " + s));
    }

    private static Optional<Integer> max(int[] data) {
        if (data.length == 0) {
            return Optional.empty();
        }
        int max = data[0];
        for (int datum : data) {
            if (datum > max) {
                max = datum;
            }
        }
        return Optional.of(max);
    }
}

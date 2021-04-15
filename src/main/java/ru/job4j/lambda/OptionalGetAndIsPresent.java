package ru.job4j.lambda;

import java.util.Optional;
/*
Для того, чтобы проверить, что в Optional есть значение или нет,
можно использовать метод isPresent(), isEmpty().
Optional.of(1).isPresent(); // даст true
Optional.empty().isEmpty(); // даст true
Для получения значения, которое мы поместили с помощью метода of() мы можем использовать метод get()
Например,
Optional.of(1).get() // Вернет 1
Optional.empty().get() // Вернет исключение!
Перед вызовом метода get() всегда нужно использовать isPresent().
В этом суть Optional, чтобы программист не забывал делать проверки.
1. Написать метод indexOf(). Он ищет индекс по значению. Если индекс не найден,
должно вернуться Optional.empty(). Если найден, то Optional из этого индекса
2. В методе get() нужно вызвать метод indexOf(). Если вернулся пустой Optional,
то метод должен вернуть -1, в противном случае сам индекс
 */
public class OptionalGetAndIsPresent {

    public static int get(int[] data, int el) {
        if (indexOf(data, el).isPresent()) {
            return indexOf(data, el).get();
        }
        return -1;
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}

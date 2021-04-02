package ru.job4j.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// * Вам необходимо реализовать метод, который принимает строку, которое является одним словом,
// * без знаков препинания цифр и пробелов. Метод должен вернуть новую строку, в которой все символы
// * исходной строки будут расставлены в алфавитном порядке.
//
// Для разделения строки на подстроки используйте метод split(), добавьте все элементы
// в коллекцию List<String>,
// * отсортируйте в порядке возрастания - используйте метод sort, в который передадите компаратор.
// * Новую строку сформируйте с помощью StringBuilder.

public class Alphabet {
    public static String reformat(String s) {
        List<String> str = new ArrayList<>(Arrays.asList(s.split("")));
        str.sort(Comparator.naturalOrder());
        StringBuilder newS = new StringBuilder();
        for (String t : str) {
            newS.append(t);
        }
        s = newS.toString();
        return s;
    }
}

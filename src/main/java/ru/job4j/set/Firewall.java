package ru.job4j.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
*Метод принимает строку, которая является названием статьи, а также коллекцию Set
* в которой содержатся слова,
* которые не должны содержаться в названиях статей, чтобы мы могли сконцентрироваться
* на материале изучения.
* Метод должен вернуть:
1. Если в строке нет ни одного слова из коллекции Set, то метод должен вернуть строку:
* Вы сделали правильный выбор!
2. Если в строке имеется хоть одно из слов из коллекции Set, метод должен вернуть строку:
* Выберите другую статью...
 */

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        Set<String> set = new HashSet<String>(List.of(s.split(" ")));
        for (String value : set) {
            if (words.contains(value)) {
                return "Выберите другую статью...";
            }
        }
        return "Вы сделали правильный выбор!";
    }
}
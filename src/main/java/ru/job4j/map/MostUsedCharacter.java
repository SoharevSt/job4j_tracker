package ru.job4j.map;

import java.util.*;

/*
Метод принимает строку, которая может содержать несколько пробелов,
однако в ней отсутствуют знаки препинания.
Необходимо реализовать метод, который вернет символ в строке, который употребляется
наибольшее количество раз. Если окажется что таких символов несколько -
необходимо вернуть первый из символов. Чтобы обеспечить сортировку символов -
собирайте исходную строку в TreeMap(), в которой ключ - это символ, значение - количество.
Перед тем как собирать строку ее нужно привести к нижнему регистру, удалить пробелы.
Для того, чтобы собрать строку в отображение используйте методы computeIfPresent()
и putIfAbsent() - первый обновит значение частотности употребления символа,
второй - вставит пару ключ(символ) значение(1) - если такого символа в отображении еще нет.
 */

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        String temp = str.replaceAll(("\\s+"), "").toLowerCase();
        for (int i = 0; i < temp.length(); i++) {
            if (map.containsKey(temp.charAt(i))) {
                map.computeIfPresent(temp.charAt(i), (k, v) -> ++v);
            } else {
                map.putIfAbsent(temp.charAt(i), 1);
            }
        }
        char rsl = map.firstKey();
        for (Character c : map.keySet()) {
            if (map.get(c) > map.get(rsl)) {
                rsl = c;
            }
        }
        return rsl;
    }
}
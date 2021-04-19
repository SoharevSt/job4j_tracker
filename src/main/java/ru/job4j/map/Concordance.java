package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Метод принимает строку, при этом слова могут содержать как строчные символы, так и прописные.
При реализации необходимо игнорировать пробелы во входной строке.

Необходимо реализовать метод, который вернет отображение, в котором ключом будет символ из
строки, а значением - список индексов, под которыми этот символ (если таких символов несколько)
входит в исходную строку. Важно: строчные и прописные символы считаются разными символами.
 */

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> map = new HashMap<>();
        String newStr = s.replaceAll("\\s+", "");
        for (int i = 0; i < newStr.length(); i++) {
            if (map.containsKey(newStr.charAt(i))) {
                map.get(newStr.charAt(i)).add(i);
            } else {
                map.put(newStr.charAt(i), new ArrayList<>(List.of(i)));
            }
        }
        return map;
    }
}

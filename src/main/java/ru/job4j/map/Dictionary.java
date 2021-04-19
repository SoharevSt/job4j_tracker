package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
В данном задании необходимо реализовать словарь. Метод принимает массив строк.
Необходимо перебрать массив и добавить строки в карту таким образом, чтобы ключом
был первый символ строки, а значением - список строк, которые начинаются на первый символ строки.
 */

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String s : strings) {
           if (rsl.containsKey(s.substring(0, 1))) {
               rsl.get(s.substring(0, 1)).add(s);
           } else {
               rsl.put(s.substring(0, 1), new ArrayList<>(List.of(s)));
           }
        }
        return rsl;
    }
}
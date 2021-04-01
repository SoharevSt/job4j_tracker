package ru.job4j.set;

import java.util.*;

/*
* Панграмма - короткий текст, который использует все буквы алфавита, по возможности не повторяя их.

Метод принимает строку(на английском языке). Необходимо реализовать его так, чтобы метод определил
* является ли входящая строка панграммой. Строчные и прописные буквы являются одинаковыми символами,
* пробелы необходимо игнорировать.
* */

public class Pangram {
    public static boolean checkString(String s) {
        String s2 = s.replaceAll("[^A-Za-z]", "").toLowerCase();
        Set<String> set = new HashSet<>(List.of(s2.split("")));
        return set.size() == 26;
    }

    public static void main(String[] args) {
        String s = "Jackdaws love my big sphinx of quartz";
        String s2 = s.replaceAll("[^A-Za-z]", "").toLowerCase();
        Set<String> set = new HashSet<>(List.of(s2.split("")));
        System.out.println(set.size());
    }
}
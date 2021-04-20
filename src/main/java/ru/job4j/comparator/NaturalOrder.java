package ru.job4j.comparator;

import java.util.Comparator;

public class NaturalOrder {
    public static Comparator<String> naturalOrder() {
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
    }
}
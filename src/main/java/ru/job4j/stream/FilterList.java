package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, -3, 4, -5, 6, -7));
        List<Integer> newList = list.stream()
                .filter(f -> f > 0)
                .collect(Collectors.toList());
        newList.forEach(System.out::println);
    }
}

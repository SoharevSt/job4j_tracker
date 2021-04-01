package ru.job4j.tracker;

import java.util.Comparator;

public class SortByNameItemReversOrder implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        int rsl = o1.getName().compareTo(o2.getName());
        return  rsl < 0 ? 1 : rsl > 0 ? -1 : 0;
    }

}

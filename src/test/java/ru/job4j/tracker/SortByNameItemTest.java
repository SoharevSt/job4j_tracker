package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class SortByNameItemTest {

    @Test
    public void whenSortByNameAndId() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(2, "Заявка"));
        items.add(new Item(1, "Заявка"));
        items.add(new Item(5, "Рапорт"));
        items.add(new Item(4, "Рапорт"));
        items.add(new Item(3, "Благодарность"));
        Comparator<Item> comparator = new SortByNameItem().thenComparing(new SortedByIdItem());
        items.sort(comparator);
        List<Item> expected = new ArrayList<>();
                expected.add(new Item(3, "Благодарность"));
                expected.add(new Item(1, "Заявка"));
                expected.add(new Item(2, "Заявка"));
                expected.add(new Item(4, "Рапорт"));
                expected.add(new Item(5, "Рапорт"));
        assertEquals(expected.toString(), items.toString());
    }
}
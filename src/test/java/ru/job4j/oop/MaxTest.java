package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax5To2And7Then7() {
        int first = 5;
        int second = 2;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 7;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax8To7Fnd6And5Then8() {
        int first = 8;
        int second = 7;
        int third = 6;
        int fourth = 5;
        int result = Max.max(first, second, third, fourth);
        int expected = 8;
        assertEquals(result, expected);
    }
}
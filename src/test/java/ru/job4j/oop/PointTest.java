package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00And01Then1() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 1);
        double expected = 1;
        double actual = a.distance(b);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when11And34Then361() {
        Point a = new Point(1, 1);
        Point b = new Point(3, 4);
        double expected = 3.61;
        double actual = a.distance(b);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when123And245Then3() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(2, 4, 5);
        double expected = 3;
        double actual = a.distance3d(b);
        assertEquals(expected, actual, 0.01);
    }
}
package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MatrixTest {
    @Test
    public void whenMatrixToList() {
        Integer[][] matrix = new Integer[][]{{1, 2, 3}, {4, 5, 6}};
        Matrix m = new Matrix();
        List<Integer> rsl = m.flatMap(matrix);
        List<Integer> expected = Stream.of(1, 2, 3, 4, 5, 6)
                .collect(Collectors.toList());
        assertEquals(expected, rsl);
    }
}
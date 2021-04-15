package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaUsage {
    public static void main(String[] args) {
        Comparator<String> cmpText = (left, right) -> {
            System.out.println("compare - " + left + " : " + right);
            return left.compareTo(right);
        };
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + left.length() + " : " + right.length());
            return Integer.compare(right.length(), left.length());
        };
        String s1 = "abc";
        String s2 = "abcd";
        List<String> l = Arrays.asList(s1, s2);
        l.sort(cmpText);
        System.out.println(l);
        l.sort(cmpDescSize);
        System.out.println(l);
    }
}

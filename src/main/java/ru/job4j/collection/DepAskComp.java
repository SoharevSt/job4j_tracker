package ru.job4j.collection;

import java.util.Comparator;

public class DepAskComp implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] s1 = left.split("/");
        String[] s2 = right.split("/");
        int length = Math.min(s1.length, s2.length);
        for (int i = 0; i < length; i++) {
            String[] arr1 = s1[i].split("(?<=\\D)(?=\\d)");
            String[] arr2 = s2[i].split("(?<=\\D)(?=\\d)");
            if (Integer.parseInt(arr1[1]) != Integer.parseInt(arr2[1])) {
                return Integer.compare(Integer.parseInt(arr1[1]), Integer.parseInt(arr2[1]));
            }
        }
        return Integer.compare(left.length(),right.length() );
    }
}

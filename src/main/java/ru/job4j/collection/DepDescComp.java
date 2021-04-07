package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] s1 = o1.split("/");
        String[] s2 = o2.split("/");
        int length = Math.min(s1.length, s2.length);
        //for (int i = 0; i < length; i++) {
            String[] arr1 = s1[0].split("(?<=\\D)(?=\\d)");
            String[] arr2 = s2[0].split("(?<=\\D)(?=\\d)");
            if (Integer.parseInt(arr1[1]) != Integer.parseInt(arr2[1])) {
                return Integer.compare(Integer.parseInt(arr2[1]), Integer.parseInt(arr1[1]));
            }
       // }
        return o1.compareTo(o2);
    }


    public static void main(String[] args) {
        String s = "k1/sk2/ssk13";
        String[] s2 = s.split("/");
        String[] arr = s2[2].split("(?<=\\D)(?=\\d)");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> collection = new HashMap<>();
        collection.put("123@google.com", "Иванов");
        collection.put("456@google.com", "Петров");
        collection.put("789@google.com", "Сидоров");
        for (String key : collection.keySet()) {
            System.out.println(key + " = " + collection.get(key));
        }
    }
}

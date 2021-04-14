package ru.job4j.lambda;

import java.util.function.Consumer;

public class MethodReference {

    private static void accept(String s) {
        System.out.println();
    }

    public void applyByInstance() {
        Consumer<String> consumer = System.out::print;
        consumer.accept("From instance: Hello");
    }

    public static void applyByClass() {
        Consumer<String> consumer = System.out::print;
        consumer.accept("From class: Hello");
    }

    private void consumerByInstance(String input) {
        System.out.print("From instance: " + input);
    }

    private static void consumerByClass(String input) {
        System.out.print("From class: " + input);
    }

}

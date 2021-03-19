package ru.job4j.oop;

public class Fix {
    private String disc;

    public Fix(String s) {
        this.disc = s;
    }

    public static void main(String[] args) {
        String text = "Is my life";
        Fix fix = new Fix(text);
    }
}

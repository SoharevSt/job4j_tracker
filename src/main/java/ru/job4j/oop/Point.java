package ru.job4j.oop;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point now) {
        return Math.sqrt(Math.pow((this.x - now.x), 2) + Math.pow((this.y - now.y), 2));
    }

    public static void main(String[] args) {
        Point a = new Point(1, 1);
        Point b = new Point(3, 4);
        System.out.printf("%.2f", a.distance(b));
    }
}

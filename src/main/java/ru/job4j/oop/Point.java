package ru.job4j.oop;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point now) {
        return Math.sqrt(Math.pow((this.x - now.x), 2) + Math.pow((this.y - now.y), 2));
    }

    public double distance3d(Point now) {
        return Math.sqrt(Math.pow((this.x - now.x), 2) + Math.pow((this.y - now.y), 2)
                + Math.pow((this.z - now.z), 2));
    }

    public static void main(String[] args) {
        Point a = new Point(1, 1);
        Point b = new Point(3, 4);
        Point a3 = new Point(1, 1, 1);
        Point b3 = new Point(2, 3, 3);
        System.out.printf("%.2f\n", a.distance(b));
        System.out.printf("%.2f", a3.distance3d(b3));
    }
}

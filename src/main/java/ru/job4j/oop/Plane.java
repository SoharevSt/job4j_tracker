package ru.job4j.oop;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Вылетает из аэропорта");
    }

    @Override
    public void printSpeed() {
        System.out.println("Средняя скорость в дороге 800 км/час");
    }
}

package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Отправляется от автовокзала");
    }

    @Override
    public void printSpeed() {
        System.out.println("Средняя скорость в дороге 60 км/час");
    }
}

package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Отправляется от ж/д вокзала");
    }

    @Override
    public void printSpeed() {
        System.out.println("Средняя скорость в дороге 100 км/час");
    }
}

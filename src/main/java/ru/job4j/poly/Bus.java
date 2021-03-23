package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Поехали!");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Пассажиров в автобусе: " + number);
    }

    @Override
    public double cosOfRefueling(double fuel) {
        return fuel * 1.87;
    }
}

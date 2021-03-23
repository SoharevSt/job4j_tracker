package ru.job4j.oop;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle bus1 = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle train1 = new Train();
        Vehicle train2 = new Train();
        Vehicle plane1 = new Plane();
        Vehicle plane2 = new Plane();
        Vehicle[] vehicles = new Vehicle[]{bus1, bus2, train1, train2, plane1, plane2};
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getClass().getSimpleName());
            vehicle.move();
            vehicle.printSpeed();
        }
    }
}

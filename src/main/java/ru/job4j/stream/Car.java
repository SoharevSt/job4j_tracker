package ru.job4j.stream;

public class Car {
    private String brand;
    private String model;
    private String engine;
    private int volume;
    private byte numberOfDoors;
    private String color;
    private int price;

    @Override
    public String toString() {
        return "Car{"
                + "brand='" + brand + '\''
                + ", model='" + model + '\''
                + ", engine='" + engine + '\''
                + ", volume=" + volume
                + ", numberOfDoors=" + numberOfDoors
                + ", color='" + color + '\''
                + ", price=" + price
                + '}';
    }

    static class Builder {
        private String brand;
        private String model;
        private String engine;
        private int volume;
        private byte numberOfDoors;
        private String color;
        private int price;

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildEngine(String engine) {
            this.engine = engine;
            return this;
        }

        Builder buildVolume(int volume) {
            this.volume = volume;
            return this;
        }

        Builder buildNumberOfDoors(byte numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Builder buildPrice(int price) {
            this.price = price;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.brand = brand;
            car.model = model;
            car.engine = engine;
            car.volume = volume;
            car.numberOfDoors = numberOfDoors;
            car.color = color;
            car.price = price;
            return car;
        }

    }

    public static void main(String[] args) {
        Car car = new Builder()
                .buildBrand("BMW")
                .buildModel("M3")
                .buildEngine("R6")
                .buildVolume(2993)
                .buildNumberOfDoors((byte) 2)
                .buildColor("Blue")
                .buildPrice(120000)
                .build();
        Car car2 = new Builder()
                .buildBrand("Mersedes")
                .buildColor("Red")
                .buildModel("E200")
                .buildNumberOfDoors((byte) 4)
                .build();
        System.out.println(car);
        System.out.println(car2);
    }
}

package ru.job4j.oop;

public class Ball {

    public void run(Object o){
        if (o.getClass() == Hare.class || o.getClass() == Wolf.class) {
            System.out.println("Убежал)");
        } else if (o.getClass() == Fox.class){
            System.out.println("Не убежал(");
        }
    }
}

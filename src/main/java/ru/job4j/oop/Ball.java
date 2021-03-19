package ru.job4j.oop;

public class Ball {

    public void run(Object o){
        if (o instanceof Hare || o instanceof Wolf) {
            System.out.println("Убежал)");
        } else if (o instanceof Fox){
            System.out.println("Не убежал(");
        }
    }
}

package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();

        ball.run(hare.tryEat(ball));
        ball.run(wolf.tryEat(ball));
        ball.run(fox.tryEat(ball));
    }
}

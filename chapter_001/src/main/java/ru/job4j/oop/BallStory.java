package ru.job4j.oop;

/**
 * class BallStory сказка по колобка
 * @author bespalov
 */
public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        hare.tryEat(ball);
        ball.song();
        ball.tryRun();
        wolf.tryEat(ball);
        ball.tryRun();
        ball.song();
        fox.tryEat(ball);
        ball.tryRun();
        ball.song();
    }

}

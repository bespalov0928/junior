package ru.job4j.stragery;

public class Paint {

    public static void main(String[] args) {
        draw(new Square());
        draw(new Triangle());
    }

    public static void  draw(Shape shape) {
        System.out.println(shape.draw());
    }


}

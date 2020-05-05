package ru.job4j.stragery;

public class Paint {

    public static void main(String[] args) {
        draw(new Square());
        System.out.println();
        draw(new Triangle());
    }

    public static void  draw(Shape shape) {
        System.out.print(shape.draw());
    }


}

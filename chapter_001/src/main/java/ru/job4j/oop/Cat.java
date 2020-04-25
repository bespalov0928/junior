package ru.job4j.oop;

/**
 * class Cat
 * @author bespalov
 */
public class Cat {

    private String food;
    private String name;

    public static void main(String[] args) {
        Cat peppy = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy say " + say);
        Cat sparky = new Cat();
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Gav");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Black");
        black.show();
    }

    /**
     * кто сказал мяу
     * @return
     */
    public String sound() {
        String voice = "may may";
        return voice;
    }

    /**
     * вывод информации о коте
     */
    public void show() {
        System.out.println("name:" + this.name + ", food:" + this.food);
    }

    /**
     * что съел кот
     * @param meat еда
     */
    public void eat(String meat) {
        this.food = meat;
    }

    /**
     * назначение клички для кота
     * @param nick
     */
    public void giveNick(String nick) {
        this.name = nick;
    }
}

package ru.job4j.oop;

/**
 * class Student описание объета студент
 * @author bespalov
 */
public class Student {
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }

    /**
     * студент играет на инструменте
     */
    public void music() {
        System.out.println("Tra tra tra");
    }

    /**
     * студент поет
     */
    public void song() {
        System.out.println("I believe I can fly");
    }

}

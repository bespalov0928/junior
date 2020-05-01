package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFIO("Абдура[ман Ибн Хаттаб");
        student.setGroup("Слизерент");
        student.setDataReceipt("2019-01-09");

        student.getFIO();
        student.getGroup();
        student.getDataReceipt();
    }
}

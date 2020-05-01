package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book0 = new Book("Clean code", 200);
        Book book1 = new Book("Двенадцать стульев", 150);
        Book book2 = new Book("Робинхон крузо", 140);
        Book book3 = new Book("Хроники капитана блада", 500);

        Book[] arrBook = new Book[4];
        arrBook[0] = book0;
        arrBook[1] = book1;
        arrBook[2] = book2;
        arrBook[3] = book3;

        for (int index = 0; index < arrBook.length; index++) {
            System.out.println("name:" + arrBook[index].getName() + ", count:" + arrBook[index].getCount());
        }

        Book tmp = arrBook[0];
        arrBook[0] = arrBook[3];
        arrBook[3] = tmp;

        System.out.println();
        for (int index = 0; index < arrBook.length; index++) {
            tmp = arrBook[index];
            if (tmp.getName().equals("Clean code")) {
                System.out.println("name:" + arrBook[index].getName() + ", count:" + arrBook[index].getCount());
            }
        }

    }
}

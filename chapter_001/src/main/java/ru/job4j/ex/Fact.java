package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        int rezult;
        rezult = new Fact().calc(-3);
        System.out.println(rezult);
    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Volume less zero");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }

}

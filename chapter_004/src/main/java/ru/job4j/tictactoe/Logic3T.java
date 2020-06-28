package ru.job4j.tictactoe;

import java.util.Arrays;
import java.util.function.Predicate;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }


    public boolean isWinnerX() {
        return isWin(Figure3T::hasMarkX);
    }

    public boolean isWinnerO() {
        return isWin(Figure3T::hasMarkO);
    }

    public boolean isWin(Predicate<Figure3T> condition) {
        return this.fillBy(condition, 0, 0, 1, 0)
                || this.fillBy(condition, 0, 1, 1, 0)
                || this.fillBy(condition, 0, 2, 1, 0)
                || this.fillBy(condition, 0, 0, 0, 1)
                || this.fillBy(condition, 1, 0, 0, 1)
                || this.fillBy(condition, 2, 0, 0, 1)
                || this.fillBy(condition, 0, 0, 1, 1)
                || this.fillBy(condition, 0, 2, 1, -1);
    }

    public boolean hasGap() {
        return Arrays.stream(this.table).flatMap(e -> Arrays.stream(e)).anyMatch(e -> !e.hasMarkX() && !e.hasMarkO());
    }

    public boolean fillBy(Predicate<Figure3T> predicate, int startX, int startY, int deltaX, int deltaY) {
        boolean rsl = true;
        for (int index = 0; index != this.table.length; index++) {
            Figure3T cell = this.table[startX][startY];
            startX += deltaX;
            startY += deltaY;
            if (!predicate.test(cell)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}

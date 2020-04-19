package ru.job4j.array;

/**
 * class MatrixCheck проверrf, что строка в двухмерном массиве целиком заполнена символом 'X'
 *
 * @author bespalov
 */
public class MatrixCheck {
    /**
     * @param board массив
     * @param row   номер строки
     * @return результат проверки
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            char value = board[row][index];
            if (value != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }


    public static boolean monoVertical(char[][] board, int colum) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[index][colum] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * выстраивает заполняет итоговый массив из входящего массива
     * @param board Исходный массив
     * @return масив результат
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int x = 0; x < board.length; x++) {
            rsl[x] = board[x][x];
        }
        return rsl;
    }


    /**
     * проверка существует ли заполненная вертикальная или горизонтальная линия
     *
     * @param board массив
     * @return результат проверки
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (x == 0 || y == 0) {
                    result = monoHorizontal(board, x) || monoVertical(board, y);

                }
                if (result) {
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }
}

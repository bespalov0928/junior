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
        for (int index = 0; index < board[0].length; index++) {
            if (board[index][colum] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }


    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (x == y) {
                    rsl[x] = board[x][y];
                }
            }
        }
        return rsl;
    }

}

package ru.job4j.array;

/**
 * class ArrayChar обработка строк
 * @author bespalov
 */
public class ArrayChar {

    /**
     *
     * @param word - массив символов для поиска
     * @param pref - массив символов для сравнения
     * @return результат сравнения массивов
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 1; index < pref.length; index++) {
            if (word[index] != pref[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

package ru.job4j.array;

/**
 * class EndsWith проверка слов
 * @author bespalov
 * @version 1.0
 */
public class EndsWith {

    /**
     * метод проверяет то, что слово заканчивается на определенную последовательность.
     * @param word слово
     * @param post окончание
     * @return результат сравнения
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            if (post[index] != word[word.length - post.length + index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

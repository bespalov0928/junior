package ru.job4j.oop;

/**
 * class DummyDic возвращает слово
 * @author bespalov
 */
public class DummyDic {
    /**
     * возвращает слово
     * @param eng словл
     * @return слово
     */
    public String engToRus(String eng) {
        String word = "Неизвестное слово. " + eng;
        return word;
    }
}

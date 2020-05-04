package ru.job4j.tracker;

public class StubInput implements Input {

    private String[] answer;
    private int position = 0;

    public StubInput(String[] answer) {
        this.answer = answer;
    }

    public String askStr(String question) {
        return answer[position++];
    }

    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }
}

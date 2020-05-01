package ru.job4j.oop.prof;

public class Builder extends Engineer {
    private String position;

    public Builder(String name, String surname, String education, String birthday, String position) {
        super(name, surname, education, birthday);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}

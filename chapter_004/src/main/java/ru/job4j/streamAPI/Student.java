package ru.job4j.streamAPI;

import java.util.Objects;

public class Student {
    private int scope;
    private String surname;

    public Student(int scope, String surname) {
        this.scope = scope;
        this.surname = surname;
    }

    public int getScope() {
        return scope;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(surname);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return Objects.equals(surname, student.surname) | Objects.equals(scope, student.scope);
    }

    @Override
    public String toString() {
        return String.format("surname:'%s', scope:'%s'", surname, scope);
    }
}

package ru.job4j.collection;

import java.awt.*;
import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private Integer age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        return Objects.equals(name, user.name) && age == user.age;

    }

    @Override
    public int compareTo(User obj) {
        int rsl = name.compareTo(obj.name);
        if (rsl == 0) {
            rsl = age.compareTo(obj.age);
        }
        return rsl;
    }
}

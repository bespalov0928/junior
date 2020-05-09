package ru.job4j.ex;

public class UserInvalidException extends ElementNotFoundException {
    UserInvalidException(String message) {
        super(message);
    }
}

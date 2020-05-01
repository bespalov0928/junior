package ru.job4j.oop.prof;

/**
 * class Surgeon описывает что может сделать хирург
 */
public class Surgeon extends Doctor {

    Operation operation;

    public Surgeon(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    /**
     * делает операцию
     * @param pacient клиент
     * @return объект операция
     */
    public Operation determin(Pacient pacient) {
        return operation;
    }

}

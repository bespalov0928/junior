package ru.job4j.oop.prof;

/**
 * class Surgeon описывает что может сделать хирург
 */
public class Surgeon extends Doctor {

    Operation operation;

    /**
     * делает операцию
     * @param pacient клиент
     * @return объект операция
     */
    public Operation determin(Pacient pacient) {
        return operation;
    }

}

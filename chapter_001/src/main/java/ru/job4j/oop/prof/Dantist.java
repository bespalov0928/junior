package ru.job4j.oop.prof;

/**
 * class Dantist описывает что может сделать стоматолог
 */
public class Dantist extends Doctor {

    Cleaning cleaning;

    /**
     * чистка зубов
     * @param pacient клиент
     * @return услуга (чистка зубов)
     */
    public Cleaning services(Pacient pacient) {
        return cleaning;
    }

}

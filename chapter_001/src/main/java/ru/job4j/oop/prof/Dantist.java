package ru.job4j.oop.prof;

/**
 * class Dantist описывает что может сделать стоматолог
 */
public class Dantist extends Doctor {

    private Cleaning cleaning;

    public Dantist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    /**
     * чистка зубов
     * @param pacient клиент
     * @return услуга (чистка зубов)
     */
    public Cleaning services(Pacient pacient) {
        return cleaning;
    }

}

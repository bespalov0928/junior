package ru.job4j.oop.prof;

/**
 * class Programmer описание что может программитс
 */
public class Programmer extends Engineer {
    Aplication aplication;

    public Programmer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    /**
     * разработаь приложение
     * @param customer
     * @return готовое приложение
     */
    public Aplication write(Customer customer) {
        return aplication;
    }
}

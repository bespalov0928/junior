package ru.job4j.oop.prof;

/**
 * class Programmer описание что может программитс
 */
public class Programmer extends Engineer {
    Aplication aplication;

    /**
     * разработаь приложение
     * @param customer
     * @return готовое приложение
     */
    public Aplication write(Customer customer) {
        return aplication;
    }
}

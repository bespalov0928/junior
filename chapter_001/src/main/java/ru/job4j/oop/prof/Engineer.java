package ru.job4j.oop.prof;

/**
 * class Engineer что может сделать инженер
 */
public class Engineer extends Profession {

    Project project;

    /**
     * разработка проекта дома
     * @param customer заказчик
     * @return проект дома
     */
    public Project development(Customer customer) {
        return project;
    }
}

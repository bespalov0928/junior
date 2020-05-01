package ru.job4j.oop.prof;

/**
 * class Engineer что может сделать инженер
 */
public class Engineer extends Profession {

    Project project;

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    /**
     * разработка проекта дома
     * @param customer заказчик
     * @return проект дома
     */
    public Project development(Customer customer) {
        return project;
    }
}

package ru.job4j.oop.prof;


public class Doctor extends Profession {

    private Diagnose diagnosis;

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Diagnose heal(Pacient pacient) {
        return diagnosis;
    }

}

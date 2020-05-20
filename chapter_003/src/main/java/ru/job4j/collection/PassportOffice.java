package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citisens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!this.citisens.containsKey(citizen.getPassport())) {
            citisens.put(citizen.getPassport(), citizen);
        }
        return rsl;
    }

    public Citizen get(String passport) {
        return this.citisens.get(passport);
    }
}

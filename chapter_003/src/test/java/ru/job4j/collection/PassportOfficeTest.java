package ru.job4j.collection;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class PassportOfficeTest {


    @Test
    public void add() {
        var citizen = new Citizen("2f44a", "Petr Arsentev");
        var office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }
}

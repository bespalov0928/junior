package ru.job4j.bank;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class BankServiceStreamTest {

    @Test
    public void findByPassport() {
        var user = new User("3434", "Petr Arsentev");
        var bank = new BankServiceStream();
        bank.addUser(user);
        assertThat(bank.findByPassportStream("3434"), is(user));
    }

    @Test
    public void addAccount() {
        var user = new User("3434", "Petr Arsentev");
        var bank = new BankServiceStream();
        bank.addUser(user);
        bank.addAccountStream(user.getPassport(), new Account("5546", 150D));
        var result = bank.findByRequisiteStream(user.getPassport(), "5546");
        assertThat("5546", is(result.getRequisite()));
    }

    @Test
    public void findByRequisiteStream() {
        var user = new User("3434", "Petr Arsentev");
        var bank = new BankServiceStream();
        bank.addUser(user);
        bank.addAccountStream(user.getPassport(), new Account("5546", 150D));
        var result = bank.findByRequisiteStream(user.getPassport(), "5546");
        assertThat(result.getRequisite(), is("5546"));
    }
}

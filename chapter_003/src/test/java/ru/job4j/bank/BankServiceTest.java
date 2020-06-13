package ru.job4j.bank;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class BankServiceTest {

    @Test
    public void addUser() {
        var user = new User("3434", "Petr Arsentev");
        var bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("3434"), is(user));
    }

    @Test
    public void whenEnterInvalidPassport() {
        var user = new User("3434", "Petr Arsentev");
        var bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        var result = bank.findByRequisite("34", "5546");
        assertNull(result);
    }

    @Test
    public void addAccount() {
        var user = new User("3434", "Petr Arsentev");
        var bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        var account = bank.findByRequisite("3434", "5546");
        double result =  account.getBalance();
        assertThat(bank.findByRequisite("3434", "5546").getBalance(), is(150D));

    }

    @Test
    public void transferMoney() {
        var user = new User("3434", "Petr Arsentev");
        var bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150D);
        assertThat(bank.findByRequisite(user.getPassport(), "113").getBalance(), is(200D));
    }
}

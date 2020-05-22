package ru.job4j.bank;

import java.util.Objects;

/**
 * class Account модель банковского счета
 * requisite реквизиты
 * balanse баланс
 */
public class Account {
    private String requisite;
    private double balanse;

    public Account(String requisite, double balanse) {
        this.requisite = requisite;
        this.balanse = balanse;
    }

    public String getRequisite() {
        return requisite;
    }

    public double getBalance() {
        return balanse;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public void setBalanse(double balanse) {
        this.balanse = balanse;
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this == null || getClass() != obj.getClass()) {
            return false;
        }
        Account account = (Account) obj;
        return Objects.equals(requisite, account.requisite);
    }
}

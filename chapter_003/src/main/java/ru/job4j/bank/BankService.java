package ru.job4j.bank;

import java.sql.SQLOutput;
import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * добавлине клиента
     *
     * @param user
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * добавление расчетного счета
     *
     * @param passport
     * @param account
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> listAccount = users.get(user);
            if (!listAccount.contains(account)) {
                listAccount.add(account);
            }
        }
    }

    /**
     * поиск клиента по паспорту
     *
     * @param passport
     * @return
     */
    public User findByPassport(String passport) {
        User rsl = null;
        Set<User> setUser = users.keySet();
        for (User user : setUser) {
            if (user.getPassport().equals(passport)) {
                rsl = user;
                break;
            }
        }
        return rsl;
    }

    /**
     * поиск счета клиента по номеру пасспорта и реквизиту счета
     *
     * @param passport
     * @param requisite
     * @return
     */
    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> listAccount = users.get(user);
            int index = listAccount.indexOf(new Account(requisite, -1));
            if (index >= 0) {
                rsl = listAccount.get(index);
            }
        }
        return rsl;
    }

    /**
     * перевод средств со счета на счет
     *
     * @param srcPassport
     * @param srcRequisite
     * @param destPassport
     * @param destRequisite
     * @param amount
     * @return
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = true;
        Account accountSrc = findByRequisite(srcPassport, srcRequisite);
        Account accountDest = findByRequisite(destPassport, destRequisite);
        if (accountSrc == null) {
            rsl = false;
            System.out.println(String.format("Не нйден счет:%ы", srcRequisite));
        } else if (accountDest == null) {
            rsl = false;
            System.out.println(String.format("Не нйден счет:%ы", destRequisite));
        } else if (accountSrc.getBalance() - amount  < 0) {
            rsl = false;
            System.out.println(String.format("на балансе:%s не достаточно средств", srcRequisite));
        }
        if (rsl) {
            accountSrc.setBalanse(accountSrc.getBalance() - amount);
            accountDest.setBalanse(accountDest.getBalance() + amount);
        }
        return rsl;
    }
}

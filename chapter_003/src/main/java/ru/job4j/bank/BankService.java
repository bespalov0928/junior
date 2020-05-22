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
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    /**
     * добавление расчетного счета
     *
     * @param passport
     * @param account
     */
    public void addAccount(String passport, Account account) {
        Account accountUser = findByRequisite(passport, account.getRequisite());
        User user = findByPassport(passport);
        List<Account> listAccount = users.get(user);
        if (!listAccount.contains(account)) {
            listAccount.add(account);
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
        if (setUser.contains(new User(passport, ""))) {
            for (User user : setUser) {
                if (!user.getPassport().equals(passport)) {
                    continue;
                }
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
        } else if (amount - accountSrc.getBalance() > 0) {
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

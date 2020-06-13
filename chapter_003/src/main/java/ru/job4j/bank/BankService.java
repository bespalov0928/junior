package ru.job4j.bank;

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
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> listAccount = users.get(user.get());
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
    public Optional<User> findByPassport(String passport) {
        Optional<User> rsl = Optional.empty();
        Set<User> setUser = users.keySet();
        for (User user : setUser) {
            if (user.getPassport().equals(passport)) {
                rsl = Optional.of(user);
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
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> rsl = null;
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> listAccount = users.get(user.get());
            int index = listAccount.indexOf(new Account(requisite, -1));
            if (index >= 0) {
                rsl = Optional.of(listAccount.get(index));
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
        Optional<Account> accountSrc = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> accountDest = findByRequisite(destPassport, destRequisite);
        if (accountSrc.isEmpty()) {
            rsl = false;
            System.out.println(String.format("Не нйден счет:%s", srcRequisite));
        } else if (accountDest.isEmpty()) {
            rsl = false;
            System.out.println(String.format("Не нйден счет:%s", destRequisite));
        } else if (accountSrc.get().getBalance() - amount  < 0) {
            rsl = false;
            System.out.println(String.format("на балансе:%s не достаточно средств", srcRequisite));
        }
        if (rsl) {
            accountSrc.get().setBalanse(accountSrc.get().getBalance() - amount);
            accountDest.get().setBalanse(accountDest.get().getBalance() + amount);
        }
        return rsl;
    }
}

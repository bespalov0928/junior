package ru.job4j.bank;

import java.util.*;

public class BankServiceStream {

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
     * поиск клиента по паспорту
     *
     * @param passport
     * @return
     */
    public User findByPassportStream(String passport) {
        User rsl = users.keySet().stream()
                .filter(x -> x.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
        return rsl;
    }

    /**
     * добавление расчетного счета
     *
     * @param passport
     * @param account
     */
    public void addAccountStream(String passport, Account account) {
        User user = findByPassportStream(passport);
        if (user != null) {
            List<Account> listAccount = users.get(user);
            if (!listAccount.contains(account)) {
                listAccount.add(account);
            }
        }
    }

    /**
     * поиск счета клиента по номеру паспорта и реквизиту счета
     *
     * @param passport
     * @param requisite
     * @return
     */
    public Account findByRequisiteStream(String passport, String requisite) {
        Account rsl = null;
        User user = findByPassportStream(passport);
        if (user != null) {
            List<Account> listAccount = users.get(user);
            rsl = listAccount.stream()
                    .filter(e -> e.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
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
    public boolean transferMoneyStream(String srcPassport, String srcRequisite,
                                       String destPassport, String destRequisite, double amount) {
        boolean rsl = true;
        Account accountSrc = findByRequisiteStream(srcPassport, srcRequisite);
        Account accountDest = findByRequisiteStream(destPassport, destRequisite);
        if (accountSrc == null) {
            rsl = false;
            System.out.println(String.format("Не нйаден счет:%s.", srcRequisite));
        } else if (accountDest == null) {
            rsl = false;
            System.out.println(String.format("Не найден счет:%s.", destRequisite));
        } else if (accountSrc.getBalance() - amount < 0) {
            rsl = false;
            System.out.println(String.format("на балансе:%s не достаточно средств.", srcRequisite));
        }
        if (rsl) {
            accountSrc.setBalanse(accountSrc.getBalance() - amount);
            accountDest.setBalanse(accountDest.getBalance() + amount);
        }
        return rsl;
    }
}

package ru.job4j.condition;

/**
 * class StringEq проверка строк на равенство
 * @author bespalov
 */
public class StringEq {
    public static void main(String[] args) {
        String your = "your_name";
        boolean userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);
    }

    /**
     * проверка строк на равенство
     * @param login строка входящая
     * @return резудбтат проверки
     */
    public static boolean check(String login) {
        String root = new String("root");
        boolean access = root.equals(login);
        return access;
    }
}

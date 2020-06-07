package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {

        Predicate<Person> predicateAddress = (person) -> (person.getAddress().contains(key));
        Predicate<Person> predicateName = (person) -> (person.getName().contains(key));
        Predicate<Person> predicatePhone = (person) -> (person.getPhone().contains(key));
        Predicate<Person> predicateSurname = (person) -> (person.getSurname().contains(key));
        Predicate<Person> combine = (person) -> {
            boolean rsl = false;
            if (predicateAddress.test(person) || predicateName.test(person) || predicatePhone.test(person) || predicateSurname.test(person)) {
                rsl = true;
            }
            return rsl;
        };

        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
//        for (Person person : persons) {
//            if (person.getAddress().contains(key) || person.getName().contains(key) || person.getPhone().contains(key) || person.getSurname().contains(key)) {
//                result.add(person);
//            }
//        }
//        return result;
    }
}

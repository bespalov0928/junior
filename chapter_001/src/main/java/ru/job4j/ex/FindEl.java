package ru.job4j.ex;

/**
 * class FindEl метод поиска индекса элемента в строковом массиве.
 */
public class FindEl {

    public static void main(String[] args) {
        try {
            int rsl = indexOf(new String[]{"1", "2", "3"}, "2");
            System.out.println(rsl);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (!value[index].equals(key)) {
                continue;
            }
            rsl = index;
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }
}

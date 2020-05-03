package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;

    }


    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    public Item[] findByName(String key) {
        Item[] namesItem = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            Item tmp = items[index];
            if (tmp.getName().equals(key)) {
                namesItem[size] = items[index];
                size++;
            }
        }
        namesItem = Arrays.copyOf(namesItem, size);
        return namesItem;
    }

    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        String rsl = String.valueOf(rm.nextLong() + System.currentTimeMillis());
        return rsl;
    }

    public boolean replace(String id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            rsl = true;
        }
        return rsl;
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean delete(String id) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != 1) {
            int start = index + 1;
            int distPos = index;
            int size = position - index;
            System.arraycopy(items, start, items, distPos, size);
            items[position - 1] = null;
            position--;
        }
        return rsl;
    }
}

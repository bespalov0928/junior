package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tracker {

    /**
     * Массив для хранения заявок.
     */
    //private final Item[] items = new Item[100];
    private final List<Item> items = new ArrayList<>();

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
        //items[position++] = item;
        items.add(item);
        return item;

    }

    /**
     * возвращает весь список задач
     *
     * @return
     */
    public List<Item> findAll() {
        //return Arrays.copyOf(items, position);
        return  items;
    }

    /**
     * поиск задачи по имени
     *
     * @param key
     * @return возвращает масив задач
     */
    public List<Item> findByName(String key) {
        List<Item> namesItem = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                namesItem.add(item);
            }
        }
        //        Item[] namesItem = new Item[position];
//        int size = 0;
//        for (int index = 0; index < position; index++) {
//            Item tmp = items[index];
//            if (tmp.getName().equals(key)) {
//                namesItem[size] = items[index];
//                size++;
//            }
//        }
//        namesItem = Arrays.copyOf(namesItem, size);
        return namesItem;
    }

    /**
     * поиск задачи по ID
     *
     * @param id
     * @return
     */
    public Item findById(String id) {
        int index = indexOf(id);
        //return index != -1 ? items[index] : null;
        return index != -1 ? items.get(index) : null;
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

    /**
     * замена задачи по индексу
     *
     * @param id
     * @param item
     * @return
     */
    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            //items[index] = item;
            items.set(index, item);
        }
        return rsl;
    }

    /**
     * ищет индекс элемента по ID задачи
     *
     * @param id
     * @return
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                rsl = items.indexOf(item);
            }

        }
//        for (int index = 0; index < position; index++) {
//            if (items[index].getId().equals(id)) {
//                rsl = index;
//                break;
//            }
//        }
        return rsl;
    }

    /**
     * удаление задачи из списка по индексу
     *
     * @param id
     * @return
     */
    public boolean delete(String id) {
        int index = indexOf(id);
        boolean rsl = index != 1;
        if (rsl) {
            items.remove(index);
//            int start = index + 1;
//            int distPos = index;
//            int size = position - index;
//            System.arraycopy(items, start, items, distPos, size);
//            items[position - 1] = null;
//            position--;
        }
        return rsl;
    }
}

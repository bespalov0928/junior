package ru.job4j.tracker;

//import java.util.Scanner;

public class StartUI {

    /**
     * создать заявку
     *
     * @param input
     * @param tracker
     */
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    /**
     * показать все заявки
     *
     * @param tracker
     */
    public static void showAllItems(Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] items = tracker.findAll();
        if (items.length == 0) {
            System.out.println("Нет ни одной заявки.");
        }
        for (Item item : items) {
            System.out.println(item);
        }
    }

    /**
     * редактирование заявки
     *
     * @param input
     * @param tracker
     */
    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        //System.out.println("Creat item. Enter name");
        String namesItem = input.askStr("Creat item. Enter name");
        //System.out.println("Creat item. Enter id");
        String idItem = input.askStr("Creat item. Enter id");
        Item newItem = new Item(namesItem);
        if (tracker.replace(idItem, newItem)) {
            System.out.println("Заявка успешно замена");
        } else {
            System.out.println("Что-то пошло не так");
        }
    }

    /**
     * удалеине заявки
     *
     * @param input
     * @param tracker
     */
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        //System.out.println("Enter id for delete");
        String id = input.askStr("Enter id for delete");
        if (tracker.delete(id)) {
            System.out.println("Заявка успешно удалена");
        } else {
            System.out.println("Что-то пошло не так");
        }
    }

    /**
     * поиск заявки по ID
     *
     * @param input
     * @param tracker
     */
    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ====");
        //System.out.println("Enter Id.");
        Item item = tracker.findById(input.askStr("Enter Id."));
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("заявка не найдена");
        }
    }

    /**
     * поиск заявки по имени
     *
     * @param input
     * @param tracker
     */
    public static void findItemsByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        //System.out.println("Enter Name");
        String name = input.askStr("Enter Name");
        Item[] namesItem = tracker.findByName(name);
        if (namesItem.length == 0) {
            System.out.println("Не найдено ни одной заявки.");
        }
        for (Item item : namesItem) {
            System.out.println(item);
        }
    }

    public void init(Input scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            //System.out.println("Select:");
            int select = scanner.askInt("Select:");
            if (select > 6) {
                System.out.println("Такой команды не существует.");
                continue;
            }

            if (select == 0) {
                createItem(scanner, tracker);
            } else if (select == 1) {
                showAllItems(tracker);
            } else if (select == 2) {
                editItem(scanner, tracker);
            } else if (select == 3) {
                deleteItem(scanner, tracker);
            } else if (select == 4) {
                findItemById(scanner, tracker);
            } else if (select == 5) {
                findItemsByName(scanner, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input scanner = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}

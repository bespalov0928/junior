package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select:");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] items = tracker.findAll();
                for (Item item: items) {
                    System.out.println(item.getName() + "," + item.getId());
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.println("Creat item. Enter name");
                Item namesItem = new Item(scanner.nextLine());
                System.out.println("Find name for replace. Enter name.");
                Item[] items = tracker.findByName(scanner.nextLine());
                if (items.length > 0) {
                    System.out.println("Insert new item insted old items. Enter name");
                    if (tracker.replace(items[0].getId(), namesItem)) {
                        System.out.println("Заявка успешно замена");
                    } else {
                        System.out.println("Что-то пошло не так");
                    }
                } else {
                    System.out.println("Не найдена заявка.");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.println("Find item for delete. Enter name");
                Item[] items = tracker.findByName(scanner.nextLine());
                if (items.length > 0) {
                    if (tracker.delete(items[0].getId())) {
                        System.out.println("Заявка успешно удалена");
                    } else {
                        System.out.println("Что-то пошло не так");
                    }
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.println("Enter Id.");
                Item item = tracker.findById(scanner.nextLine());
                if (item != null) {
                    System.out.println("name:" + item.getName() + ", id:" + item.getId());
                } else {
                    System.out.println("заявка не найдена");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.println("Enter Name");
                String name = scanner.nextLine();
                Item[] namesItem = tracker.findByName(name);
                for (Item item:namesItem) {
                    System.out.println("name:" + item.getName() + ", id:" + item.getId());
                }    
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
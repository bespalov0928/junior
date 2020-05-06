package ru.job4j.tracker;

public class ShowAllItems implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        if (items.length == 0) {
            System.out.println("Нет ни одной заявки.");
        }
        for (Item item : items) {
            System.out.println(item);
        }

        return true;
    }
}

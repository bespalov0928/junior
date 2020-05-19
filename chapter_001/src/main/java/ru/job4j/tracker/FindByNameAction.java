package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter Name");
        List<Item> namesItem = tracker.findByName(name);
        if (namesItem.size() == 0) {
            System.out.print("Не найдено ни одной заявки.");
        }
        for (Item item : namesItem) {
            System.out.print(item);
        }
        return true;
    }
}

package ru.job4j.tracker;

public class FindItemById implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item item = tracker.findById(input.askStr("Enter Id."));
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("заявка не найдена");
        }
        return true;
    }
}

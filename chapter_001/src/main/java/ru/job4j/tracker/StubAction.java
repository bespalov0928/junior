package ru.job4j.tracker;

import java.util.StringJoiner;

public class StubAction implements UserAction {
    private boolean call = false;
    @Override
    public String name() {
        return new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("=== Create a new Item ====")
                .add("1. === Show all items ====")
                .add("2. === Edit item ====")
                .add("3. === Delete item ====")
                .add("4. === Find item by Id ====")
                .add("5. === Find items by name ====")
                .add("6. === Exit ====")
                .toString();
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        call = true;
        return false;
    }

    public boolean isCall() {
        return call;
    }
}

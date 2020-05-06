package ru.job4j.tracker;

public class EditItem implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String namesItem = input.askStr("Creat item. Enter name");
        String idItem = input.askStr("Creat item. Enter id");
        Item newItem = new Item(namesItem);
        if (tracker.replace(idItem, newItem)) {
            System.out.println("Заявка успешно замена");
        } else {
            System.out.println("Что-то пошло не так");
        }

        return true;
    }
}

package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id for delete");
        if (tracker.delete(id)) {
            System.out.println("Заявка успешно удалена");
        } else {
            System.out.println("Что-то пошло не так");
        }
        return true;
    }
}

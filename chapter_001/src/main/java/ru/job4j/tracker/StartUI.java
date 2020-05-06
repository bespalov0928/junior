package ru.job4j.tracker;

public class StartUI {

    public void init(Input scanner, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = scanner.askInt("Select:");
            if (select > 6) {
                System.out.println("Такой команды не существует.");
                continue;
            }
            UserAction action = actions[select];
            run = action.execute(scanner, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {

        System.out.println("Menu.");

        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input scanner = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(),
                new ShowAllItems(),
                new EditItem(),
                new DeleteItem(),
                new FindItemById(),
                new FindItemsByName(),
                new Exit()};
        new StartUI().init(scanner, tracker, actions);
    }
}

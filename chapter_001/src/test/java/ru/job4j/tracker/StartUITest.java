package ru.job4j.tracker;


import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;


public class StartUITest {

    @Test
    public void whenAddItem() {
//        String[] answers = {"Fix PC"};
//        Input input = new StubInput(answers);
//        Tracker tracker = new Tracker();
//        new CreateAction(input, tracker);
//        Item created = tracker.findAll()[0];
//        Item expected = new Item("Fix PC");
//        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void showAllItems() {
    }

    @Test
    public void editItem() {

//        Tracker tracker = new Tracker();
//        Item item = new Item("name1");
//        tracker.add(item);
//        String[] answer2 = {"name2", item.getId()};
//        Input input2 = new StubInput(answer2);
//        new EditItem(input2, tracker);
//        Item created = tracker.findAll()[0];
//
//        Item expected = new Item("name2");
//        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void deleteItem() {
//        Tracker tracker = new Tracker();
//        Item item1 = new Item("name1");
//        Item item2 = new Item("name2");
//        Item item3 = new Item("name3");
//        tracker.add(item1);
//        tracker.add(item2);
//        tracker.add(item3);
//
//        String id = item3.getId();
//        String[] answer = {id};
//        Input input = new StubInput(answer);
//        new DeleteItem(input, tracker);
//        Item created = tracker.findById(id);
//        assertThat(created, is(nullValue()));
    }

    @Test
    public void findItemById() {
    }

    @Test
    public void findItemsByName() {
    }


    @Test
    public void whenExit() {
        StubInput input = new StubInput(
                new String[]{"0", "1"}
        );
        StubAction action = new StubAction();
        StubAction action1 = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[]{action, action1});
        assertThat(action.isCall(), is(true));
    }

    @Test
    public void whenPrtMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(new String[]{"0"});

        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[]{action});
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. === Create a new Item ====")
                .add("1. === Show all items ====")
                .add("2. === Edit item ====")
                .add("3. === Delete item ====")
                .add("4. === Find item by Id ====")
                .add("5. === Find items by name ====")
                .add("6. === Exit ====")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.out.println(def);
    }
}

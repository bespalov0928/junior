package ru.job4j.tracker;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void showAllItems() {
    }

    @Test
    public void editItem() {

        String[] answer1 = {"name1"};
        Input input1 = new StubInput(answer1);
        Tracker tracker = new Tracker();
        StartUI.createItem(input1, tracker);
        Item item = tracker.findAll()[0];

        String[] answer2 = {"name2", item.getId()};
        Input input2 = new StubInput(answer2);
        StartUI.editItem(input2, tracker);
        Item created = tracker.findAll()[0];

        Item expected = new Item("name2");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void deleteItem() {
    }

    @Test
    public void findItemById() {
    }

    @Test
    public void findItemsByName() {
    }
}

package ru.job4j.tracker;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class TrackerTest {


    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void findAll() {
        List<Item> extend = new ArrayList<>();

        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        Item item4 = new Item("test4");
        extend.add(item1);
        extend.add(item2);
        extend.add(item4);

        Tracker tracker = new Tracker();
        tracker.add(item1);
        tracker.add(item2);
        //tracker.add(item3);
        tracker.add(item4);
        List<Item> result = tracker.findAll();
        assertThat(extend, is(result));
    }

    @Test
    public void findByName() {
        Item task = new Item("task");
        Item task1 = new Item("task");
        Item task2 = new Item("task2");
        Item task3 = new Item("task3");

        List<Item> extend = new ArrayList<>();
        extend.add(task);
        extend.add(task1);

        Tracker tracker = new Tracker();
        tracker.add(task);
        tracker.add(task1);
        tracker.add(task2);
        tracker.add(task3);
        List<Item> rezult = tracker.findByName("task");
        assertThat(extend, Is.is(rezult));
    }

    @Test
    public void findById() {
        Item task = new Item("task");
        Item task1 = new Item("task");
        Item task2 = new Item("task2");
        Item task3 = new Item("task3");

        Item extend = task;

        Tracker tracker = new Tracker();
        tracker.add(task);
        tracker.add(task1);
        tracker.add(task2);
        tracker.add(task3);

        Item result = tracker.findById(task.getId());
        assertThat(extend, Is.is(result));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }

    @Test
    public void whenCheckOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item item = new Item("name1");
        tracker.add(item);
        ShowAllItems act = new ShowAllItems();
        act.execute(new StubInput(Arrays.asList(new String[]{})), tracker);
        String exect = new StringJoiner(System.lineSeparator() + "" + System.lineSeparator())
                .add(String.format("Item{name='%s', id='%s'}", item.getName(), item.getId()))
                .toString();
        assertThat(new String(out.toByteArray()), is(exect));
        System.setOut(def);
    }

    @Test
    public void findByNameNew() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Input input = new StubInput(Arrays.asList(new String[]{"name1"}));
        Tracker tracker = new Tracker();
        Item item = new Item("name1");
        tracker.add(item);
        FindItemsByName act = new FindItemsByName();
        act.execute(input, tracker);
        String ecpect = new StringJoiner(System.lineSeparator() + "" + System.lineSeparator())
                 .add(String.format("Item{name='%s', id='%s'}", item.getName(), item.getId()))
                .toString();
        assertThat(new String(out.toByteArray()), is(ecpect));
        System.setOut(def);
    }

    @Test
    public void findByIdNew() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Input input = new StubInput(Arrays.asList(new String[]{"id"}));
        Item item = new Item("name1");
        Tracker tracker = new Tracker();
        tracker.add(item);
        FindItemById act = new FindItemById();
        act.execute(new StubInput(Arrays.asList(new String[]{tracker.findAll().get(0).getId()})), tracker);
        String expect = new StringJoiner(System.lineSeparator() + "" + System.lineSeparator())
                .add("Item{" + "name='" + item.getName() + '\'' + ", id='" + item.getId() + '\'' + '}')
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));

        System.setOut(def);
    }
}
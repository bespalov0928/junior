package ru.job4j.tracker;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

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
        Item[] extend = new Item[3];
        
        Item item = new Item("test1");
        Item item1 = new Item("test2");
        Item item2 = new Item("test3");
        extend[0] = item;
        extend[1] = item1;
        extend[2] = item2;

        Tracker tracker = new Tracker();
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        Item[] result = tracker.findAll();
        assertThat(extend, is(result));
    }

    @Test
    public void findByName() {
        Item task = new Item("task");
        Item task1 = new Item("task");
        Item task2 = new Item("task2");
        Item task3 = new Item("task3");

        Item[] extend = new Item[2];
        extend[0] = task;
        extend[1] = task1;

        Tracker tracker = new Tracker();
        tracker.add(task);
        tracker.add(task1);
        tracker.add(task2);
        tracker.add(task3);
        Item[] rezult = tracker.findByName("task");
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
}

package ru.job4j.tracker;

import org.junit.Test;

import java.time.format.DateTimeFormatter;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenShowAll() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item1"));
        UserAction[] actions = {
                new ShowAllAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Show all items" + System.lineSeparator() +
                        "1. Exit Program" + System.lineSeparator() +
                        "=== Show all items ====" + System.lineSeparator() +
                        "Item{id=1, name='Item1', created=" +
                        item.getCreated().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss")) +
                        "}" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Show all items" + System.lineSeparator() +
                        "1. Exit Program" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindById() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1", "1"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item1"));
        UserAction[] actions = {
                new FindByIdAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find item by Id" + System.lineSeparator() +
                        "1. Exit Program" + System.lineSeparator() +
                        "=== Find item by Id ====" + System.lineSeparator() +
                        "Item{id=1, name='Item1', created=" +
                        item.getCreated().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss")) +
                        "}" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find item by Id" + System.lineSeparator() +
                        "1. Exit Program" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByName() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item1", "1"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item1"));
        UserAction[] actions = {
                new FindByNameAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find items by name" + System.lineSeparator() +
                        "1. Exit Program" + System.lineSeparator() +
                        "=== Find items by name ====" + System.lineSeparator() +
                        "Item{id=1, name='Item1', created=" +
                        item.getCreated().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss")) +
                        "}" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find items by name" + System.lineSeparator() +
                        "1. Exit Program" + System.lineSeparator()
        ));
    }


    @Test
    public void whenExit() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit Program" + System.lineSeparator()
        ));
    }

    @Test
    public void whenCreateItem() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }
}
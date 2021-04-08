package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertEquals("Arsentev", persons.get(0).getSurname());
    }

    @Test
    public void whenNotFoundPerson() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Ivan");
        assertEquals(0, persons.size());
    }
}
package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ProfilesTest {
    @Test
    public void whenCollectAddress() {
        List<Profile> profiles = List.of(
                new Profile(new Address("Minsk", "Bogdanovicha", 25, 20)),
                new Profile(new Address("Minsk", "Semenyko", 15, 34)),
                new Profile(new Address("Mogilev", "Lenina", 44, 12)),
                new Profile(new Address("Borisov", "Moskovskaya", 20, 10))
        );
        Profiles pr = new Profiles();
        List<Address> rsl = pr.collect(profiles);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Minsk", "Bogdanovicha", 25, 20));
        expected.add(new Address("Minsk", "Semenyko", 15, 34));
        expected.add(new Address("Mogilev", "Lenina", 44, 12));
        expected.add(new Address("Borisov", "Moskovskaya", 20, 10));
        assertEquals(expected, rsl);
    }

}
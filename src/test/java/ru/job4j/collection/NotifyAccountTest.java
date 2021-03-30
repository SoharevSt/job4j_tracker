package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {

    @Test
    public void whenUniquePassport() {
        List<Account> accounts = Arrays.asList(
                new Account("eDer3432f", "Petr Arsentev", "123"),
                new Account("000001", "Petr Arsentev", "142")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("eDer3432f", "Petr Arsentev", "123"),
                        new Account("000001", "Petr Arsentev", "142")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void whenNotUniquePassport() {
        List<Account> accounts = Arrays.asList(
                new Account("000001", "Petr Arsentev", "123"),
                new Account("000001", "Petr Arsentev", "142")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("000001", "Petr Arsentev", "123")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}
package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> userAccount = users.get(user);
        if (user != null) {
            userAccount.add(account);
            users.putIfAbsent(user, userAccount);
        }
    }

    public User findByPassport(String passport) {
        User result = null;
        for(User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                result = user;
            }
        }
        return result;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    result = account;
                }
            }
        }
        return result;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean result = false;
        User srcUser = findByPassport(srcPassport);
        User destUser = findByPassport(destPassport);
        if (srcUser != null && destUser != null) {
            for (Account account : users.get(srcUser)) {
                if (account.getRequisite().equals(srcRequisite)
                        && account.getBalance() >= amount) {
                    account.setBalance(account.getBalance() - amount);
                    break;
                }
            }
            for (Account account : users.get(destUser)) {
                if (account.getRequisite().equals(destRequisite)) {
                    account.setBalance(account.getBalance() + amount);
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}

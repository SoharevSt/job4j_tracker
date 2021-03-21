package ru.job4j.oop;

public class Builder extends Engineer {
    private String department;

    public Builder(String name, String surname, String education,
                   String birthday, String workplace, String department) {
        super(name, surname, education, birthday, workplace);
        this.department = department;
    }

    public void buildHouse(Client client) {

    }
}

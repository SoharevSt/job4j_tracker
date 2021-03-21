package ru.job4j.oop;

public class Programmer extends Engineer {
    private String department;

    public Programmer(String name, String surname, String education,
                      String birthday, String workplace, String department) {
        super(name, surname, education, birthday, workplace);
        this.department = department;
    }

    public void writeCod (Client client) {

    }
}

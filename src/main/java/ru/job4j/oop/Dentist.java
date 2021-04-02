package ru.job4j.oop;

public class Dentist extends Doctor {
    private String department;

    public Dentist(String name, String surname, String education,
                   String birthday, String workplace, String department) {
        super(name, surname, education, birthday, workplace);
        this.department = department;
    }

    public void removeTooth(Pacient pacient) {

    }
}

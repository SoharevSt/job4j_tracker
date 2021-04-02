package ru.job4j.oop;

public class Surgeon extends Doctor {
    private String department;

    public Surgeon(String name, String surname, String education,
                   String birthday, String workplace, String department) {
        super(name, surname, education, birthday, workplace);
        this.department = department;
    }

    public void performSurgery(Pacient pacient) {

    }

}

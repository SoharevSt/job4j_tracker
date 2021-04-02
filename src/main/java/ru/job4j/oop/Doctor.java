package ru.job4j.oop;

public class Doctor extends Profession {
    private String workplace;

    public Doctor(String name, String surname, String education,
                  String birthday, String workplace) {
        super(name, surname, education, birthday);
        this.workplace = workplace;
    }

    public void heal(Pacient pacient) {

    }

    public void makeDiagnosis(Pacient pacient) {

    }
}

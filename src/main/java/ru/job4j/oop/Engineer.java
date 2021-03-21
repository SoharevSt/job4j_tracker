package ru.job4j.oop;

public class Engineer extends Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;
    private String workplace;

    public Engineer(String name, String surname, String education,
                    String birthday, String workplace) {
        super(name, surname, education, birthday);
        this.workplace = workplace;
    }

    public void getTask(Client client) {

    }

    public void makeProject(Client client) {

    }
}

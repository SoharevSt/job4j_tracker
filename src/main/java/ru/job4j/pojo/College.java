package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Иванов");
        student.setGroup("A36");
        student.setDate(new Date());
        System.out.println("Студент: " + student.getName()
                            + "\nГруппа: " + student.getGroup()
                            + "\nДата поступления: " + student.getDate());
    }
}

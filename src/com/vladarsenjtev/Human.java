package com.vladarsenjtev;

import java.util.ArrayList;
import java.util.List;

public class Human {
    protected String name;
    protected String surname;
    protected String patronymic;


    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public List<String> getFullName() {
        List<String> fullName = new ArrayList<>();
        if (patronymic == null) {
            fullName.add(name);
            fullName.add(surname);
        } else {
            fullName.add(name);
            fullName.add(surname);
            fullName.add(patronymic);
        }
        return fullName;
    }

    public List<String> getShortName() {
        List<String> fullName = new ArrayList<>();
        if (patronymic == null) {
            fullName.add(name);
            fullName.add(surname.charAt(0) + ".");
        } else {
            fullName.add(name);
            fullName.add(surname.charAt(0) + ".");
            fullName.add(patronymic.charAt(0) + ".");
        }
        return fullName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
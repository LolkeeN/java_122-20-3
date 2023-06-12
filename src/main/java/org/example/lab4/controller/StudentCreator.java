package org.example.lab4.controller;

import org.example.lab4.model.Human;
import org.example.lab4.model.Sex;
import org.example.lab4.model.Student;

public class StudentCreator {

    public static Human createStudent(String firstName, String lastName, String patronymic, Sex sex) {
        Human student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setPatronymic(patronymic);
        student.setSex(sex);
        return student;
    }

    public static void main(String[] args) {
        System.out.println(createStudent("firstName", "lastName", "patronymic",
                Sex.MALE));
    }
}

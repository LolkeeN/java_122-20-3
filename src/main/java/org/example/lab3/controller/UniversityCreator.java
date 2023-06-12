package org.example.lab3.controller;

import java.util.List;
import org.example.lab3.model.Cathedra;
import org.example.lab3.model.Faculty;
import org.example.lab3.model.Human;
import org.example.lab3.model.Sex;
import org.example.lab3.model.University;

public class UniversityCreator {


    public static University createUniversity(String name, Human head, List<Faculty> faculties){
        University university = new University();
        university.setHead(head);
        university.setName(name);
        university.setFaculties(faculties);

        return university;
    }

    public static void main(String[] args) {
        createUniversity("faculty", StudentCreator.createStudent("firstName", "lastName", "patronymic",
                Sex.MALE), List.of(FacultyCreator.run(), FacultyCreator.run(), FacultyCreator.run()));
    }
}

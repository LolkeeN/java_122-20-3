package org.example.lab4.controller;

import java.util.List;
import org.example.lab4.model.Faculty;
import org.example.lab4.model.Human;
import org.example.lab4.model.Sex;
import org.example.lab4.model.University;

public class UniversityCreator {


    public static University createUniversity(String name, Human head, List<Faculty> faculties) {
        University university = new University();
        university.setHead(head);
        university.setName(name);
        university.setFaculties(faculties);

        return university;
    }

    public static University run() {
        return createUniversity("faculty", StudentCreator.createStudent("firstName", "lastName", "patronymic",
                Sex.MALE), List.of(org.example.lab4.controller.FacultyCreator.run(), org.example.lab4.controller.FacultyCreator.run(),
                FacultyCreator.run()));
    }
}

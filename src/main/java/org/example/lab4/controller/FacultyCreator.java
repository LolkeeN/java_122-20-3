package org.example.lab4.controller;

import java.util.List;
import org.example.lab4.model.Cathedra;
import org.example.lab4.model.Faculty;
import org.example.lab4.model.Human;
import org.example.lab4.model.Sex;

public class FacultyCreator {

    public static Faculty createFaculty(String name, Human head, List<Cathedra> cathedras) {
        Faculty faculty = new Faculty();
        faculty.setHead(head);
        faculty.setName(name);
        faculty.setCathedras(cathedras);

        return faculty;
    }

    public static Faculty run() {
        return createFaculty("faculty", StudentCreator.createStudent("firstName", "lastName", "patronymic",
                Sex.MALE), List.of(CathedraCreator.run(), CathedraCreator.run(), CathedraCreator.run()));
    }
}

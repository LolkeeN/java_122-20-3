package org.example.lab4.controller;

import java.util.List;
import org.example.lab4.model.Group;
import org.example.lab4.model.Human;
import org.example.lab4.model.Sex;

public class GroupCreator {

    public static Group createGroup(String name, Human head, List<Human> students) {
        Group group = new Group();
        group.setHead(head);
        group.setName(name);

        return group;
    }

    public static Group run() {
        return createGroup("group", StudentCreator.createStudent("firstName", "lastName", "patronymic",
                Sex.MALE), List.of(
                StudentCreator.createStudent("firstName2", "lastName2", "patronymic2",
                        Sex.MALE), StudentCreator.createStudent("firstName3", "lastName3", "patronymic3",
                        Sex.MALE), StudentCreator.createStudent("firstName4", "lastName4", "patronymic4",
                        Sex.MALE)
        ));
    }
}

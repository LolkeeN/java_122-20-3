package org.example.lab3.controller;

import java.util.List;
import org.example.lab3.model.Cathedra;
import org.example.lab3.model.Group;
import org.example.lab3.model.Human;
import org.example.lab3.model.Sex;

public class CathedraCreator {

    public static Cathedra createCathedra(String name, Human head, List<Group> groups){
        Cathedra cathedra = new Cathedra();
        cathedra.setHead(head);
        cathedra.setName(name);
        cathedra.setGroupList(groups);

        return cathedra;
    }

    public static Cathedra run() {
        return createCathedra("cathedra", StudentCreator.createStudent("firstName", "lastName", "patronymic",
                Sex.MALE), List.of(GroupCreator.run(), GroupCreator.run(), GroupCreator.run()));
    }
}

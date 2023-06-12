package org.example.lab3.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cathedra {
    private String name;
    private Human head;

    private List<Group> groupList;
}

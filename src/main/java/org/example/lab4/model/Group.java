package org.example.lab4.model;

import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Group {

    private String name;
    private Human head;
    private List<Human> students;

}

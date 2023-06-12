package org.example.lab3.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Human {

    private String firstName;
    private String lastName;
    private String patronymic;
    private Sex sex;
}

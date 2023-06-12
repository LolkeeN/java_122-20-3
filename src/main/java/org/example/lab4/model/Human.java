package org.example.lab4.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode
public abstract class Human {

    private String firstName;
    private String lastName;
    private String patronymic;
    private Sex sex;

}

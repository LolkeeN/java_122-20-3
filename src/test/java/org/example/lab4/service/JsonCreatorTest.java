package org.example.lab4.service;

import org.example.lab4.controller.UniversityCreator;
import org.example.lab4.model.University;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class JsonCreatorTest {

    private final JsonCreator jsonCreator = new JsonCreator();
    @Test
    void jsonCreatorShouldCreateProperObjects(){
        University university1 = UniversityCreator.run();
        University university2 = UniversityCreator.run();

        String university1Json = jsonCreator.createJsonFromClass(university1);
        String university2Json = jsonCreator.createJsonFromClass(university2);

        assertEquals(university1, university2);
        assertEquals(university1Json, university2Json);
    }
}

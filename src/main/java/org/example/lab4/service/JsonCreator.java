package org.example.lab4.service;

import com.google.gson.Gson;

public class JsonCreator {

    private final Gson gson = new Gson();

    public String createJsonFromClass(Object object) {
        return gson.toJson(object);
    }

    public <T> T createObjectFromJson(String json, Class<T> clazz) {
        return gson.fromJson(json, clazz);
    }
}

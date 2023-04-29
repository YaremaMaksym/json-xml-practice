package com.xsakon.json;

import com.google.common.io.Resources;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xsakon.json.model.Person;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Json {

    public void serializeListOfPeople(List<Person> people) throws IOException {
        String json = new Gson().toJson(people);
        OutputStream outputStream = new FileOutputStream("src/main/resources/people.json");
        IOUtils.write(json, outputStream, StandardCharsets.UTF_8);
    }

    public void serializePerson(Person person) throws IOException {
        String json = new Gson().toJson(person);
        OutputStream outputStream = new FileOutputStream("src/main/resources/person.json");
        IOUtils.write(json, outputStream, StandardCharsets.UTF_8);
    }


    public List<Person> deserializeListOfPeople() throws IOException{
        InputStream inputStream = Resources.getResource("people.json").openStream();
        String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        Type peopleListType = new TypeToken<ArrayList<Person>>() {}.getType();
        return new Gson().fromJson(json, peopleListType);
    }


    public Person deserializePerson() throws IOException {
        InputStream inputStream = Resources.getResource("person.json").openStream();
        String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        return new Gson().fromJson(json, Person.class);
    }
}

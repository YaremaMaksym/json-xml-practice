package com.xsakon;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xsakon.model.Address;
import com.xsakon.model.Car;
import com.xsakon.model.Person;
import com.xsakon.utils.Json;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Json jsonUtils = new Json();

        Address address = new Address("Ukraine", "Lviv");
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Porsche", "911 Carrera Coupe", "Red", 2020, 137_113d));
        cars.add(new Car(2, "Porsche", "Panamera", "Aquamarine", 2013, 48_719d));
        Person person1 = new Person(1, "Francis", "Brunn", address, "fbrunn3@gmail.com", cars);
        Person person2 = new Person(2, "Francis", "Brunn", address, "fbrunn3@gmail.com", cars);

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);



        try {

            jsonUtils.serializePerson(person1);
            jsonUtils.serializeListOfPeople(people);

            List<Person> deserializedListOfPeople = jsonUtils.deserializeListOfPeople();
            Person deserializedPerson = jsonUtils.deserializePerson();


            System.out.println("deserializedPerson:");
            System.out.println(deserializedPerson.toString());

            System.out.println("\ndeserializedListOfPeople:");
            deserializedListOfPeople.forEach(System.out::println);

        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }


    }
}
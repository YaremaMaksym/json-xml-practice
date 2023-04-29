package com.xsakon.json.model;

import java.util.List;

public class Person {

    private Integer id;
    private String firstName;
    private String lastName;
    private Address address;
    private String email;
    private List cars;

    public Person(Integer id, String firstName, String lastName, Address address, String email, List cars) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.cars = cars;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public List getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", cars=" + cars +
                '}';
    }
}
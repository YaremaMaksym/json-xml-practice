package com.xsakon.xml.jaxb.model;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person", propOrder = {
        "name",
        "age",
        "address"})
public class Person {

    @XmlAttribute(required = true)
//    @XmlId                        позначить що це поле має бути унікальним
    private String login;

    @XmlAttribute(required = true)
    private String facility;

    @XmlElement(required = true)
    private String name;

    @XmlElement(required = true)
    private int age;

    @XmlElement(required = true)
    private Address address;

    public Person() {} //           Потрібен для маршалізації/демаршалізації XML

    public Person(String login, String facility, String name, int age, Address address) {
        this.login = login;
        this.facility = facility;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "login='" + login + '\'' +
                ", facility='" + facility + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}

package com.xsakon.xml.jaxb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Persons {

    @XmlElement(name="person")
    List<Person> list = new ArrayList<>();
    public Persons() {}

    public void setList(List<Person> list) {
        this.list = list;
    }
    public void addPerson(Person person) {
        list.add(person);
    }

    @Override
    public String toString() {
        return "Persons{" +
                "list=" + list +
                '}';
    }
}

package com.xsakon.xml.jaxb;

import com.xsakon.xml.jaxb.model.Address;
import com.xsakon.xml.jaxb.model.Person;
import com.xsakon.xml.jaxb.model.Persons;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class JaxbWriter {
    public static void main(String[] args) {

        Persons persons = new Persons();
        persons.addPerson(new Person("george", "NULP", "Alex", 19, new Address("Ukraine", "Lviv")));
        persons.addPerson(new Person("cheko", "KPI", "Mike", 20, new Address("Ukraine", "Kyiv")));

        try {
            JAXBContext context = JAXBContext.newInstance(Persons.class);
            Marshaller m = context.createMarshaller();
            m.marshal(persons, new FileOutputStream("src/main/java/com/xsakon/xml/jaxb/personsJaxbWrote.xml"));

            System.out.println("XML-file was created");
        } catch (JAXBException e) {
            System.out.println("JAXB-context is wrong: " + e);
        } catch (FileNotFoundException e) {
            System.out.println("Can't find XML-file: " + e);
        }

    }
}

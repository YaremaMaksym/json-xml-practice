package com.xsakon.xml.jaxb;

import com.xsakon.xml.jaxb.model.Persons;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JaxbReader {
    public static void main(String[] args) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Persons.class);
            Unmarshaller u = jaxbContext.createUnmarshaller();
            FileReader reader = new FileReader("src/main/java/com/xsakon/xml/jaxb/personsJaxbWrited.xml");

            Persons persons = (Persons) u.unmarshal(reader);
            System.out.println(persons);
        } catch (JAXBException e) {
            System.out.println("JAXB-context is wrong: " + e);
        } catch (FileNotFoundException e) {
            System.out.println("Can't find XML-file: " + e);
        }
    }
}

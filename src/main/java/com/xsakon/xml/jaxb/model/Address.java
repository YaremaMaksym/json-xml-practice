package com.xsakon.xml.jaxb.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name = "address", propOrder = {
        "country",
        "city"
})
public class Address {

    private String Country;
    private String City;

    public Address() {
    }

    public Address(String country, String city) {
        Country = country;
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Country='" + Country + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
}

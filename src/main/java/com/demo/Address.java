package com.demo;

import java.util.Map;

public class Address {

    private String city ;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    private int zipcode ;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }

    public Iterable<? extends Map.Entry<String,?>> entrySet() {

        return null;
    }
}

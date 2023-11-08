package com.demo;

import java.util.List;
import java.util.Map;

public class Customer {

    private int id;
    private String name;

    public Map<String, String> getAddress() {
        return address;
    }

    public void setAddress(Map<String, String> address) {
        this.address = address;
    }

    private Map<String, String > address;

    private List<String> cities;

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCities() {
        return cities;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", cities=" + cities +
                '}';
    }

    public void setCities() {
        this.cities = cities;
    }



}



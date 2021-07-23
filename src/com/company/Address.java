package com.company;

public class Address {
    private String street;
    private  String city;
    private String state;

    public Address(String street,String city,String state){
        this.state=state;
        this.city=city;
        this.street=street;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}

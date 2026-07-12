package com.cognizant.spring_learn_country;

public class Country {
    String code;
    String Name;

    
    public Country() {
    }

    public Country(String code, String name) {
        this.code = code;
        Name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    
}

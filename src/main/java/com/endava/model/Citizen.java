package com.endava.model;


import javax.validation.constraints.*;

public class Citizen {

    @Size(min = 1, max = 50, message = "Name must be between 1 and 50 characters long")
    private String name;

    @NotNull(message = "Age must be between 0 and 150")
    private Integer age;

    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

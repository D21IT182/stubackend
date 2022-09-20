package com.example.studentbackend.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    private Integer id;

    private String name;
    private String address;

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

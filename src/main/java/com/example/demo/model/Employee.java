package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
public class Employee {

    public Employee(){

    }

    public Employee(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull(message="Name cannot be null")
    @Column(name="name")
    private String name;

    private Integer age ;


    @Size(min = 5,max = 10,message="address cannot be null")
    @Column(name="address")
    private String address;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
